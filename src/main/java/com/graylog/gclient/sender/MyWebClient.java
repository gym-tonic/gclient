package com.graylog.gclient.sender;

import com.graylog.gclient.configuration.GClientServerConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;

@Service
public class MyWebClient<DTO> {
    private static final Logger LOG = LoggerFactory.getLogger(MyWebClient.class);
    private static final String ENDPOINT_PATTERN = "%s:%d/gelf";

    private final WebClient webClient;
    private final GClientServerConfiguration serverConfig;

    @Autowired
    public MyWebClient(WebClient.Builder builder, GClientServerConfiguration serverConfig) {
        this.webClient = builder.build();
        this.serverConfig = serverConfig;
    }

    public void post(DTO dto, Class<?> dtoClass) {
        try {
            webClient.post().uri(new URI(String.format(ENDPOINT_PATTERN, serverConfig.getApplicationHostname(), serverConfig.getApplicationPort())))
                    .body(Mono.just(dto), dtoClass).retrieve()
                    .onStatus(httpStatus -> !httpStatus.is2xxSuccessful(), response -> {
                                LOG.error("POST /gelf failed with {} status for dto {}", response.statusCode().value(), dto);
                                return Mono.error(new RuntimeException(String.format("POST /gelf failed with %d status for dto %s", response.statusCode().value(), dto)));
                            }
                    ).onStatus(httpStatus -> httpStatus.is2xxSuccessful(), response -> {
                        LOG.info("POST /gelf http status code {}", response.statusCode().value());
                        return Mono.empty();
                    }).bodyToMono(String.class).block();
        } catch (Exception e) {
            LOG.error("Posting gelf message failed: ", e);
        }
    }
}

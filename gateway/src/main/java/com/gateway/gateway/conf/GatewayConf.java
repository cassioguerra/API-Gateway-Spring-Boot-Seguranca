package com.gateway.gateway.conf;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConf {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
       return builder .routes()
       .route("cliente", r -> r
             .path("/cliente")
             .uri("http://localhost:8082/"))
       .route("staff" , r -> r 
            .path("/staff")
            .uri("http://localhost:8083/"))
            .build();
    }
    
}

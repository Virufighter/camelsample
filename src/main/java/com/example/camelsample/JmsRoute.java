package com.example.camelsample;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class JmsRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {

            from("jms:queue:myQueue").log("Received message: ${body}").to("file:c:\\camelOut?fileName=output.txt");


    }
}

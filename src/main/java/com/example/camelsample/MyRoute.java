package com.example.camelsample;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


public class MyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:C:\\Users\\alvin.poulose\\OneDrive - NeST Group\\Documents\\sourc")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        Message input=exchange.getIn();
                        String data= input.getBody(String.class);
                        System.out.println(data);
                    }
                })
                .to("file:C:\\Users\\alvin.poulose\\OneDrive - NeST Group\\Documents\\dest");
    }
}

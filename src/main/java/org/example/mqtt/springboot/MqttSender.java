package org.example.mqtt.springboot;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MqttSender {

    void sendToMqtt(String data);

}

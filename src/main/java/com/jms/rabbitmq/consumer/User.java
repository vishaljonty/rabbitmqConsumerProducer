package com.jms.rabbitmq.consumer;

import com.jms.rabbitmq.config.MessageConfig;
import com.jms.rabbitmq.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {
    @RabbitListener(queues = MessageConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {

        System.out.println("Message Received from queue:" + orderStatus);
    }


}

package choru.rabbitmq.consumer.service;

import choru.rabbitmq.consumer.messageDto.MessageDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ConsumerService {

    @RabbitListener(queues = "hello.queue")
    public void receiveMessage(MessageDto message){
        log.info("들어온 메시지 : " + message.getMessage());

    }


}

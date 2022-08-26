package com.mus.consumer;

import com.mus.consumer.utils.ConsumerApplicationConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics= ConsumerApplicationConstants.TOPIC_NAME, groupId=ConsumerApplicationConstants.GROUP_ID)
    public void consume(String message) throws IOException {
        logger.info(String.format(" Consumed Message -> %s",message));
    }
}

package com.yl.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class QueueListenter implements MessageListener{
	private static final Logger log = LoggerFactory.getLogger(QueueListenter.class);
	@Override
	public void onMessage(Message message) {
		log.info("========================"+message.toString());
	}

}

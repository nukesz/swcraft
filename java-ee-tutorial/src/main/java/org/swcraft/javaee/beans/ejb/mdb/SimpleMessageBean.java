package org.swcraft.javaee.beans.ejb.mdb;

import javax.ejb.MessageDriven;
import javax.jms.MessageListener;
import javax.jms.Message;
import javax.jms.TextMessage;
import javax.jms.JMSException;
import java.util.logging.Logger;

// To create the Queue and the ConnectionFactory
// asadmin create-jms-resource --restype javax.jms.ConnectionFactory --description "connection factory for demo" --property ClientId=MyID jms/ConnectionFactory
// asadmin create-jms-resource --restype javax.jms.Queue --property Name=PhysicalQueue jms/Queue

@MessageDriven(mappedName = "jms/Queue")
public class SimpleMessageBean implements MessageListener {
	private static final Logger LOGGER = Logger.getLogger(SimpleMessageBean.class.getName());

	@Override
	public void onMessage(Message inMessage) {
		try {
			if (inMessage instanceof TextMessage) {
				TextMessage msg = (TextMessage) inMessage;
				LOGGER.info("MESSAGE BEAN: Message received: " + msg.getText());
			} else {
				LOGGER.warning("Message of wrong type: " + inMessage.getClass().getName());
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
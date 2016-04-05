package org.swcraft.javaee.beans.ejb.mdb;


import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Connection;
import javax.jms.Session;
import javax.jms.MessageProducer;
import javax.jms.TextMessage;

import org.swcraft.javaee.beans.ejb.services.IncrementerServiceBean;

import javax.jms.JMSException;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class SimpleMessageClient {
    @Resource(mappedName = "jms/ConnectionFactory")
    private ConnectionFactory connectionFactory;
    @Resource(mappedName = "jms/Queue")
    private Queue queue;
    
    @EJB
    IncrementerServiceBean service;
    
    @Schedule(second="*", minute="*", hour="*")
    public void sendMessage() throws JMSException {
        try (Connection connection = connectionFactory.createConnection()){
        	Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(queue);
            TextMessage message = session.createTextMessage();

			message.setText("This is the message: " + service.getNext());
			System.out.println("Sending message: " + message.getText());
			messageProducer.send(message);
        }
    } 
} 

package com.java1234.listenerTopic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author gaoxu
 * @date 2019-05-20 17:20
 * @description ... 类
 */
public class Listener02 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        // TODO Auto-generated method stub
        try {
            System.out.println("收到的消息：" + ((TextMessage) message).getText());
        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

package com.java1234.avtiveMQ02listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author gaoxu
 * @company 北山小旭网络科技有限公司
 * @create 2019-05-15-10:14 PM
 */
public class Listener implements MessageListener {

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

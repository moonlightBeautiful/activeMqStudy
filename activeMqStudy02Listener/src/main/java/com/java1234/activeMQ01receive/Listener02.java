package com.java1234.activeMQ01receive;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author gaoxu
 * @company 北山小旭网络科技有限公司
 * @create 2019-05-15-10:28 PM
 */
public class Listener02 implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("订阅者一收到的消息：" + ((TextMessage) message).getText());
        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

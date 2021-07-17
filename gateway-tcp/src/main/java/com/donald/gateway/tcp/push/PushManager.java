package com.donald.gateway.tcp.push;

/**
 * 消息推送管理组件
 *
 * @author donald
 * @date 2021/07/17
 */
public class PushManager {

    /**
     * 启动消息推送组件
     */
    public void start() {
        new PushThread().start();
    }

    /**
     * 消息推送线程
     */
    class PushThread extends Thread {

        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(60 * 1000);
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
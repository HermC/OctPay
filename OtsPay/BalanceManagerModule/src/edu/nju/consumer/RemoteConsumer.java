package edu.nju.consumer;

import edu.nju.service.DemoService;
import edu.nju.service.REService;
import edu.nju.service.TradeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hermit on 2017/3/13.
 */
public class RemoteConsumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        REService res = (REService) context.getBean("reService"); // 获取远程服务代理
        String hello = res.doRedEnvelope("hello world"); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
    }
}

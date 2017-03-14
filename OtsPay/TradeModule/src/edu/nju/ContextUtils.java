package edu.nju;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hermit on 2017/3/13.
 */
public class ContextUtils {

    private static ClassPathXmlApplicationContext consumerContext = new ClassPathXmlApplicationContext("consumer.xml");
    private static ClassPathXmlApplicationContext providerContext = new ClassPathXmlApplicationContext("provider.xml");

    public static ClassPathXmlApplicationContext getConsumerContext() {
        return consumerContext;
    }

    public static ClassPathXmlApplicationContext getProviderContext() {
        return providerContext;
    }
}

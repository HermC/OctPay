package edu.nju.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hermit on 2017/3/13.
 */
public class BankProvider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();

        System.out.println("start bank provider");

        System.in.read(); // 按任意键退出
    }
}

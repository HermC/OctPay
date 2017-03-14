package edu.nju.service.impl;

import edu.nju.ContextUtils;
import edu.nju.service.REService;
import edu.nju.service.TradeService;
import edu.nju.service.VerifyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Hermit on 2017/3/13.
 */
public class RESample implements REService {

    @Override
    public String doRedEnvelope(String data) {
        ApplicationContext context = ContextUtils.getConsumerContext();

        data = "do red envelope: (" + data + ")";

        TradeService tradeService = (TradeService) context.getBean("tradeService");
        VerifyService verifyService = (VerifyService) context.getBean("verifyService");

        data = verifyService.doVerify(data);
        data = tradeService.doTrade(data);

        return data;
    }
}

package edu.nju.service.impl;

import edu.nju.ContextUtils;
import edu.nju.service.GoDutchService;
import edu.nju.service.TradeService;
import edu.nju.service.VerifyService;
import org.springframework.context.ApplicationContext;

/**
 * Created by Hermit on 2017/3/13.
 */
public class GoDutchSample implements GoDutchService {

    @Override
    public String doGoDutch(String data) {
        data = "do go dutch: (" + data + ")";

        ApplicationContext context = ContextUtils.getConsumerContext();
        TradeService tradeService = (TradeService) context.getBean("tradeService");
        VerifyService verifyService = (VerifyService) context.getBean("verifyService");

        data = verifyService.doVerify(data);
        data = tradeService.doTrade(data);

        return data;
    }
}

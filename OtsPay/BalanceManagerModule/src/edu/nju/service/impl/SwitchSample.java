package edu.nju.service.impl;

import edu.nju.ContextUtils;
import edu.nju.service.SwitchService;
import edu.nju.service.TradeService;
import edu.nju.service.VerifyService;
import org.springframework.context.ApplicationContext;

/**
 * Created by Hermit on 2017/3/13.
 */
public class SwitchSample implements SwitchService {

    @Override
    public String doSwitch(String data) {
        data = "do switch: (" + data + ")";

        ApplicationContext context = ContextUtils.getConsumerContext();
        TradeService tradeService = (TradeService) context.getBean("tradeService");
        VerifyService verifyService = (VerifyService) context.getBean("verifyService");

        data = tradeService.doTrade(data);
        data = verifyService.doVerify(data);

        return data;
    }
}

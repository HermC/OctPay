package edu.nju.service.impl;

import edu.nju.ContextUtils;
import edu.nju.service.BankService;
import edu.nju.service.FinanceLogService;
import edu.nju.service.OrderService;
import edu.nju.service.TradeService;
import org.springframework.context.ApplicationContext;

/**
 * Created by Hermit on 2017/3/13.
 */
public class TradeSample implements TradeService {

    @Override
    public String doTrade(String data) {
        data = "do trade: (" + data + ")";

        ApplicationContext context = ContextUtils.getConsumerContext();
        OrderService orderService = (OrderService) context.getBean("orderService");
        FinanceLogService financeLogService = (FinanceLogService) context.getBean("financeLogService");
        BankService bankService = (BankService) context.getBean("bankService");

        data = orderService.doOrder(data);
        data = financeLogService.doFinanceLog(data);
        data = bankService.doBank(data);

        return data;
    }
}

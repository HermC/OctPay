package edu.nju.service.impl;

import edu.nju.service.BankService;

/**
 * Created by Hermit on 2017/3/13.
 */
public class BankSample implements BankService {

    //TODO 接入Bank外部接口

    @Override
    public String doBank(String bank) {
        return "do bank: (" + bank + ")";
    }
}

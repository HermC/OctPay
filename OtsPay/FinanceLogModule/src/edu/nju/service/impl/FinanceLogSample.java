package edu.nju.service.impl;

import edu.nju.service.FinanceLogService;

/**
 * Created by Hermit on 2017/3/13.
 */
public class FinanceLogSample implements FinanceLogService {

    //TODO 接入FinanceLog数据库管理 FinanceLogDAO

    @Override
    public String doFinanceLog(String data) {
        return "do finance: (" + data + ")";
    }
}

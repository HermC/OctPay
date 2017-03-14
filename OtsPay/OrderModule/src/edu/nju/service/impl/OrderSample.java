package edu.nju.service.impl;

import edu.nju.service.OrderService;

/**
 * Created by Hermit on 2017/3/13.
 */
public class OrderSample implements OrderService {

    //TODO 接入Order数据库管理 OrderDAO

    @Override
    public String doOrder(String data) {
        data = "do order: (" + data + ")";
        return data;
    }
}

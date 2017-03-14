package edu.nju.service.impl;

import edu.nju.service.VerifyService;

/**
 * Created by Hermit on 2017/3/13.
 */
public class VerifySample implements VerifyService {

    @Override
    public String doVerify(String data) {
        return "do verify: (" + data + ")";
    }
}

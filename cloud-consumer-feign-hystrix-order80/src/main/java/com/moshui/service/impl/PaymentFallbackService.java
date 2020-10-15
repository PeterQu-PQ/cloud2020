package com.moshui.service.impl;

import com.moshui.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "Ok_服务出错，请稍后重试！！！";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "连接超时，请稍后重试！！！";
    }
}

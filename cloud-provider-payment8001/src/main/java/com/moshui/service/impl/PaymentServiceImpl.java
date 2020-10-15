package com.moshui.service.impl;

import com.moshui.dao.PaymentDAO;
import com.moshui.entities.Payment;
import com.moshui.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDAO paymentDAO;
    @Override
    public int create(Payment payment) {
        return paymentDAO.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDAO.getPaymentById(id);
    }
}

package com.moshui.dao;

import com.moshui.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDAO {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") long id);
}

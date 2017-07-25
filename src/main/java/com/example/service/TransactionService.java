package com.example.service;

import com.example.model.TransactionDO;

import java.sql.Timestamp;
import java.util.List;


public interface TransactionService {
    List<TransactionDO> getTransactionByUId(Integer uid);

    Integer countTransactionByPId(Integer pid);

    Integer countTransactionByTime(Timestamp timestamp);

    List<TransactionDO> getTransactionByPId(Integer pid);

    void saveTransaction(Integer pid,Integer number,Integer userId);
}

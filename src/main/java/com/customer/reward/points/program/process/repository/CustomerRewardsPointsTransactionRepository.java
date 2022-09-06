package com.customer.reward.points.program.process.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customer.reward.points.program.process.entity.Transaction;

@Repository
@Transactional
public interface CustomerRewardsPointsTransactionRepository extends CrudRepository<Transaction,Long> {
    public List<Transaction> findAllByCustomerId(Long customerId);

    public List<Transaction> findAllByCustomerIdAndTransactionDateBetween(Long customerId, Timestamp from,Timestamp to);
}

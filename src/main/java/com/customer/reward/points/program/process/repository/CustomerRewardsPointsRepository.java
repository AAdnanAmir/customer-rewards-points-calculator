package com.customer.reward.points.program.process.repository;

import org.springframework.data.repository.CrudRepository;

import com.customer.reward.points.program.process.entity.Customer;

public interface CustomerRewardsPointsRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}

package com.customer.reward.points.program.process.service;

import com.customer.reward.points.program.process.model.CustomerRewardPoints;



public interface CustomerRewardsPointsService {
    public CustomerRewardPoints getRewardsByCustomerId(Long customerId);
}

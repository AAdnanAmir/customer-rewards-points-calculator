package com.customer.reward.points.program.process.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.reward.points.program.process.entity.Customer;
import com.customer.reward.points.program.process.model.CustomerRewardPoints;
import com.customer.reward.points.program.process.repository.CustomerRewardsPointsRepository;
import com.customer.reward.points.program.process.service.CustomerRewardsPointsService;

@RestController
@RequestMapping("/customers")
public class CustomerRewardsPointsController {

    @Autowired
    CustomerRewardsPointsService customerRewardsPointsService;

    @Autowired
    CustomerRewardsPointsRepository customerRewardsPointsRepository;

    @GetMapping(value = "/{customerId}/rewards",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerRewardPoints> getRewardsByCustomerId(@PathVariable("customerId") Long customerId){
        Customer customer = customerRewardsPointsRepository.findByCustomerId(customerId);
        if(customer == null)
        {
        	throw new RuntimeException("Invalid / Missing customer Id ");
        }
        CustomerRewardPoints customerRewards = customerRewardsPointsService.getRewardsByCustomerId(customerId);
        return new ResponseEntity<>(customerRewards,HttpStatus.OK);
    }

}

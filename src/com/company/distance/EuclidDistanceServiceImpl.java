package com.company.distance;

import com.company.Customer;

public class EuclidDistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Customer c1, Customer c2) {
        return Math.sqrt(Math.pow(c1.getAge() - c2.getAge(), 2) + Math.pow(c1.getIncome() - c2.getIncome(), 2));
    }
}

package com.company.distance;

import com.company.Customer;

public class ManhattanDistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Customer c1, Customer c2) {
        return Math.abs(c1.getAge() - c2.getAge()) + Math.abs(c1.getIncome() - c2.getIncome());
    }
}

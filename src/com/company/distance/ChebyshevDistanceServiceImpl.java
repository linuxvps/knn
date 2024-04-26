package com.company.distance;

import com.company.Customer;

public class ChebyshevDistanceServiceImpl implements DistanceService {

    @Override
    public double calculateDistance(Customer c1, Customer c2) {
        return Math.max(Math.abs(c1.getAge() - c2.getAge()), Math.abs(c1.getIncome() - c2.getIncome()));
    }
}

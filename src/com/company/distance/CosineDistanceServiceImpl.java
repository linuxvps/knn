package com.company.distance;

import com.company.Customer;

public class CosineDistanceServiceImpl implements DistanceService{
    @Override
    public double calculateDistance(Customer c1, Customer c2) {
        double dotProduct = c1.getAge() * c2.getAge() + c1.getIncome() * c2.getIncome();
        double magnitudeC1 = Math.sqrt(c1.getAge() * c1.getAge() + c1.getIncome() * c1.getIncome());
        double magnitudeC2 = Math.sqrt(c2.getAge() * c2.getAge() + c2.getIncome() * c2.getIncome());
        double v = 1 - (dotProduct / (magnitudeC1 * magnitudeC2));
        return v;
    }
}

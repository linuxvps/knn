package com.company.distance;

import com.company.Customer;

public class CombinedDistanceServiceImpl implements DistanceService {

    private DistanceService firstDistanceService;
    private DistanceService secondDistanceService;

    public CombinedDistanceServiceImpl(DistanceService firstDistanceService, DistanceService secondDistanceService) {
        this.firstDistanceService = firstDistanceService;
        this.secondDistanceService = secondDistanceService;
    }

    @Override
    public double calculateDistance(Customer customer1, Customer customer2) {
        // ترکیب فاصله اقلیدسی و فاصله کسینوسی
        double euclidDistance = firstDistanceService.calculateDistance(customer1, customer2);
        double cosineDistance = secondDistanceService.calculateDistance(customer1, customer2);

        // می‌توانید وزن‌های مختلفی را برای هر فاصله امتحان کنید تا بهترین ترکیب را پیدا کنید
        double combinedDistance = (euclidDistance + cosineDistance) / 2;
        return combinedDistance;
    }
}
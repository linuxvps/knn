package com.company;

import com.company.distance.CombinedDistanceServiceImpl;
import com.company.distance.DistanceService;
import com.company.distance.EuclidDistanceServiceImpl;
import com.company.distance.ManhattanDistanceServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        KnnService knnService = new KnnServiceImpl();
        DistanceService distanceService =
                new CombinedDistanceServiceImpl(new EuclidDistanceServiceImpl(), new ManhattanDistanceServiceImpl());
        List<Customer> customers = new ArrayList<>();
        Map<Customer, Double> customerDistances = new HashMap<>();
        // Sample data
        customers.add(new Customer(22, 35000.0, "yes"));
        customers.add(new Customer(25, 40000.0, "yes"));
        customers.add(new Customer(28, 45000.0, "no"));
        customers.add(new Customer(29, 48000.0, "yes"));
        // Target customer
        Customer target = new Customer(50, 80000.0);
        // KNN algorithm
        int k = 3;
        for (Customer customer : customers) {
            double distance = distanceService.calculateDistance(target, customer);
            System.out.println("distance of target from customer with age " + customer.getAge() + " is :" + distance);
            customerDistances.put(customer, distance);
        }
        // Sort neighbors by distance
        List<Customer> kNearestNeighbors = knnService.getNearestNeighbors(customerDistances, k);
        kNearestNeighbors.forEach(Customer::logToConsole);
        String classifyTarget = knnService.classifyTarget(kNearestNeighbors);
        System.out.println("Classified as: " + classifyTarget);
    }

}
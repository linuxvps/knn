package com.company;

import java.util.List;
import java.util.Map;

public interface KnnService {


   List<Customer> getNearestNeighbors(Map<Customer, Double> customerDistances, int k);

   String classifyTarget(List<Customer> neighbors);
}

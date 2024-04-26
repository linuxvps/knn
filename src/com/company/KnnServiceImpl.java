package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KnnServiceImpl implements KnnService {


    @Override
    public List<Customer> getNearestNeighbors(Map<Customer, Double> customerDistances, int k) {
        List<Customer> collect = customerDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public String classifyTarget(List<Customer> neighbors) {

        int yesCount = 0;
        int noCount = 0;
        for (Customer neighbor : neighbors) {
            if (neighbor.getClassName().equals("yes")) {
                yesCount++;
            } else {
                noCount++;
            }
        }
        return yesCount > noCount ? "yes" : "no";
    }
}

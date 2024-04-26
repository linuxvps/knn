package com.company.distance;

import com.company.Customer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JaccardDistanceServiceImpl implements DistanceService {
    @Override
    public double calculateDistance(Customer c1, Customer c2) {
        // تبدیل ویژگی‌های مشتریان به مجموعه‌های دودویی
        Set<Integer> s1 = new HashSet<>(Arrays.asList(c1.getAge(), c1.getIncome().intValue()));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(c2.getAge(), c2.getIncome().intValue()));

        // ایجاد مجموعه‌ای برای اشتراک و اجتماع
        Set<Integer> intersection = new HashSet<>(s1);
        Set<Integer> union = new HashSet<>(s1);

        // محاسبه اشتراک و اجتماع
        intersection.retainAll(s2);
        union.addAll(s2);

        // محاسبه فاصله جاکارد
        return 1.0 - ((double) intersection.size() / union.size());
    }
}


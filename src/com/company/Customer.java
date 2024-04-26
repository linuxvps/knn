package com.company;

public class Customer {
    private Integer age;
    private Double income;
    private String className;

    public Customer(Integer age, Double income) {
        this.age = age;
        this.income = income;
    }

    public Customer(Integer age, Double income, String className) {

        this.age = age;
        this.income = income;
        this.className = className;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String logToConsole() {
        String s = "Customer{" +
                "age=" + age +
                ", income=" + income +
                ", className='" + className + '\'' +
                '}';
        System.out.println(s);
        return s;
    }
}

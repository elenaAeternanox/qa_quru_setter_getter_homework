package com.github.elenaAeternanox.sixthDotOneHomeWork;

public class Customer {

    public static String CUSTOMER_TYPE_PRINT = "                Customer:";
    public static String CUSTOMER_NAME_PRINT = "Customer's name: ";
    public static String EMPTY_RAW_PRINT = " ";
    public static String SUM_PRINT = "Has sum: ";

    private String customersName;
    private int customersSum;

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public int getCustomersSum() {
        return customersSum;
    }

    public void setCustomersSum(int customersSum) {
        this.customersSum = customersSum;
    }

    public void printCustomerDescription() {
        System.out.println(CUSTOMER_TYPE_PRINT);
        System.out.println(CUSTOMER_NAME_PRINT + customersName);
        System.out.println(SUM_PRINT + customersSum);
        System.out.println(EMPTY_RAW_PRINT);
    }
}

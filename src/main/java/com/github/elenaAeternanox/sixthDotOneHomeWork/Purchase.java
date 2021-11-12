package com.github.elenaAeternanox.sixthDotOneHomeWork;

import java.util.List;

import static com.github.elenaAeternanox.sixthDotOneHomeWork.RealEstate.*;

public class Purchase {

    public static String CUSTOMERS_SUM_PRINT = "Customer has $: ";
    public static String APARTS_PRICE_PRINT = "Apart's price $: ";

    static class Condition {
        int customerSum;
        int apartPrice;

        public void printConditionDescription() {
            System.out.println(CUSTOMERS_SUM_PRINT + customerSum);
            System.out.println(APARTS_PRICE_PRINT + apartPrice);
            calcPossibility(apartPrice, customerSum);
            System.out.println(EMPTY_RAW_PRINT);
        }

        public void calcPossibility(int apartPrice, int customerHas) {
            boolean purchaseIsPossible;
            if (apartPrice <= customerHas) {
                purchaseIsPossible = true;
            } else {
                purchaseIsPossible = false;
            }
            printPossibility(purchaseIsPossible);
        }

        public void printPossibility(boolean purchaseIsPossible) {
            if (!purchaseIsPossible) {
                System.out.println("Purchase's impossible :(");
            } else {
                System.out.println("Congrats!!! Purchase's possible :)");
            }
        }
    }

    public static void main(String[] args) {
        Customer firstCustomer = new Customer();
        firstCustomer.setCustomersName("First customer");
        firstCustomer.setCustomersSum(234123);

        Customer secondCustomer = new Customer();
        secondCustomer.setCustomersName("Second customer");
        secondCustomer.setCustomersSum(450432);
        firstCustomer.printCustomerDescription();

        Customer thirdCustomer = new Customer();
        thirdCustomer.setCustomersName("Third customer");
        thirdCustomer.setCustomersSum(128000);
        firstCustomer.printCustomerDescription();

        Customer forthCustomer = new Customer();
        forthCustomer.setCustomersName("Forth customer");
        forthCustomer.setCustomersSum(5439888);
        firstCustomer.printCustomerDescription();

        firstCustomer.printCustomerDescription();
        secondCustomer.printCustomerDescription();
        thirdCustomer.printCustomerDescription();
        forthCustomer.printCustomerDescription();
        System.out.println(EMPTY_RAW_PRINT +
                EMPTY_RAW_PRINT +
                EMPTY_RAW_PRINT);

        Apart firstApart = new RealEstate.Apart();
        firstApart.setApartId(1);
        firstApart.setApartAddress("First apart's address");
        firstApart.setApartPrice(235678);
        firstApart.setApartSquare(34.5);
        firstApart.setApartNumberOfRooms(1);
        firstApart.setApartIsSold(false);

        Apart secondApart = new RealEstate.Apart();
        secondApart.setApartId(firstApart.getApartId() + 1);
        secondApart.setApartAddress("Second apart's address");
        secondApart.setApartPrice(435678);
        secondApart.setApartSquare(54.5);
        secondApart.setApartNumberOfRooms(3);
        secondApart.setApartIsSold(false);

        House firstHouse = new RealEstate.House();
        firstHouse.setHouseId(1);
        firstHouse.setHouseAddress("First house's address");
        firstHouse.setHouseAreaSquare(176.3);
        firstHouse.setHousePrice(784356);
        firstHouse.setHouseSquare(75.2);
        firstHouse.setHouseNumberOfRooms(3);
        firstHouse.setHouseIsSold(true);

        House secondHouse = new RealEstate.House();
        secondHouse.setHouseId(firstHouse.getHouseId() + 1);
        secondHouse.setHouseAddress("Second house's address");
        secondHouse.setHouseAreaSquare(176.3);
        secondHouse.setHousePrice(1234567);
        secondHouse.setHouseSquare(175.2);
        secondHouse.setHouseNumberOfRooms(5);
        secondHouse.setHouseIsSold(true);

        firstApart.printApartDescription();
        secondApart.printApartDescription();
        firstHouse.houseDescription();
        secondHouse.houseDescription();
        System.out.println("" +
                "" +
                "");


        Seller firstSeller = new Seller("First seller", "First seller's address");
        firstSeller.setApartsList(List.of(firstApart, secondApart));
        firstSeller.setHousesList(List.of(secondHouse));

        Seller secondSeller = new Seller("Second seller", "Second seller's address");
        secondSeller.setHousesList(List.of(firstHouse));

        firstSeller.printSellerDescription();
        /* check apart's list and house's list aren't empty
        if it's true, print their description
        */
        if (firstSeller.getApartsList() != null) {
            for (int i = 0; i < firstSeller.getApartsList().size(); i++) {
                firstSeller.getApartsList().get(i).printApartDescription();
            }
        } else {
            System.out.println("There aren't aparts");
        }
        if (firstSeller.getHousesList() != null) {
            for (int i = 0; i < firstSeller.getHousesList().size(); i++) {
                firstSeller.getHousesList().get(i).houseDescription();
            }
        } else {
            System.out.println("There aren't houses");
        }
        System.out.println(EMPTY_RAW_PRINT);
        System.out.println(EMPTY_RAW_PRINT);

        secondSeller.printSellerDescription();
        /* check apart's list and house's list aren't empty
        if it's true, print their description
        */
        if (secondSeller.getApartsList() != null) {
            for (int i = 0; i < secondSeller.getApartsList().size(); i++) {
                secondSeller.getApartsList().get(i).printApartDescription();
            }
        } else {
            System.out.println("There aren't aparts");
        }
        if (secondSeller.getHousesList() != null) {
            for (int i = 0; i < secondSeller.getHousesList().size(); i++) {
                secondSeller.getHousesList().get(i).houseDescription();
            }
        } else {
            System.out.println("There aren't houses");
        }
        System.out.println("" +
                "" +
                "");

        Condition firstCondition = new Condition();
        firstCondition.customerSum = firstCustomer.getCustomersSum();
        firstCondition.apartPrice = secondApart.getApartPrice();

        Condition secondCondition = new Condition();
        secondCondition.customerSum = secondCustomer.getCustomersSum();
        secondCondition.apartPrice = firstHouse.getHousePrice();

        Condition thirdCondition = new Condition();
        thirdCondition.customerSum = thirdCustomer.getCustomersSum();
        thirdCondition.apartPrice = secondHouse.getHousePrice();

        Condition forthCondition = new Condition();
        forthCondition.customerSum = forthCustomer.getCustomersSum();
        forthCondition.apartPrice = firstApart.getApartPrice();

        firstCondition.printConditionDescription();
        secondCondition.printConditionDescription();
        thirdCondition.printConditionDescription();
        forthCondition.printConditionDescription();
    }
}

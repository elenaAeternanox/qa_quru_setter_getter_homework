package com.github.elenaAeternanox.sixthDotOneHomeWork;

import java.util.List;

public class Seller {

    public static String SELLER_TYPE_PRINT = "                Seller:";
    public static String SELLER_NAME_PRINT = "Seller's name: ";
    public static String EMPTY_RAW_PRINT = " ";
    public static String SELLER_ADDRESS = "Seller's address: ";

    private String sellersName;
    private String sellersAddress;
    private List<RealEstate.Apart> apartsList;
    private List<RealEstate.House> housesList;

    public String getSellersName() {
        return sellersName;
    }

    public void setSellersName(String sellersName) {
        this.sellersName = sellersName;
    }

    public String getSellersAddress() {
        return sellersAddress;
    }

    public void setSellersAddress(String sellersAddress) {
        this.sellersAddress = sellersAddress;
    }

    public List<RealEstate.Apart> getApartsList() {
        return apartsList;
    }

    public void setApartsList(List<RealEstate.Apart> apartsList) {
        this.apartsList = apartsList;
    }

    public List<RealEstate.House> getHousesList() {
        return housesList;
    }

    public void setHousesList(List<RealEstate.House> housesList) {
        this.housesList = housesList;
    }

    public void sellerDescription() {
        System.out.println(SELLER_TYPE_PRINT);
        System.out.println(SELLER_NAME_PRINT + sellersName);
        System.out.println(SELLER_ADDRESS + sellersAddress);
        System.out.println(EMPTY_RAW_PRINT);
    }
}

package com.github.elenaAeternanox.sixthDotOneHomeWork;

public class RealEstate {

    public static String APARTMENT_TYPE_PRINT = "                Apartment:";
    public static String HOUSE_TYPE_PRINT = "                House:";
    public static String EMPTY_RAW_PRINT = " ";
    public static String ID_PRINT = "Id: ";
    public static String PRICE_PRINT = "Price: ";
    public static String ADDRESS_PRINT = "Address: ";
    public static String SQUARE_PRINT = "Square: ";
    public static String ROOMS_NUMBER_PRINT = "Number of rooms: ";
    public static String IS_SOLD_PRINT = "Sold: ";
    public static String AREA_SQUARE_PRINT = "Square of outside area: ";

    static class Apart {
        private int apartId;
        private int apartPrice;
        private String apartAddress;
        private double apartSquare;
        private int apartNumberOfRooms;
        private boolean apartIsSold = false;

        public int getApartId() {
            return apartId;
        }

        public void setApartId(int apartId) {
            this.apartId = apartId;
        }

        public int getApartPrice() {
            return apartPrice;
        }

        public void setApartPrice(int apartPrice) {
            this.apartPrice = apartPrice;
        }

        public void setApartAddress(String apartAddress) {
            this.apartAddress = apartAddress;
        }

        public void setApartSquare(double apartSquare) {
            this.apartSquare = apartSquare;
        }

        public void setApartNumberOfRooms(int apartNumberOfRooms) {
            this.apartNumberOfRooms = apartNumberOfRooms;
        }

        public void setApartIsSold(boolean apartIsSold) {
            this.apartIsSold = apartIsSold;
        }

        public void printApartDescription() {
            System.out.println(APARTMENT_TYPE_PRINT);
            System.out.println(ID_PRINT + apartId);
            System.out.println(PRICE_PRINT + apartPrice);
            System.out.println(ADDRESS_PRINT + apartAddress);
            System.out.println(SQUARE_PRINT + apartSquare);
            System.out.println(ROOMS_NUMBER_PRINT + apartNumberOfRooms);
            System.out.println(IS_SOLD_PRINT + apartIsSold);
            System.out.println(EMPTY_RAW_PRINT);
        }
    }

    static class House {
        private int houseId;
        private int housePrice;
        private String houseAddress;
        private double houseSquare;
        private int houseNumberOfRooms;
        private boolean houseIsSold = false;
        private double houseAreaSquare;

        public int getHouseId() {
            return houseId;
        }

        public void setHouseId(int houseId) {
            this.houseId = houseId;
        }

        public int getHousePrice() {
            return housePrice;
        }

        public void setHousePrice(int housePrice) {
            this.housePrice = housePrice;
        }

        public void setHouseAddress(String houseAddress) {
            this.houseAddress = houseAddress;
        }

        public void setHouseSquare(double houseSquare) {
            this.houseSquare = houseSquare;
        }

        public void setHouseNumberOfRooms(int houseNumberOfRooms) {
            this.houseNumberOfRooms = houseNumberOfRooms;
        }

        public void setHouseIsSold(boolean houseIsSold) {
            this.houseIsSold = houseIsSold;
        }

        public void setHouseAreaSquare(double houseAreaSquare) {
            this.houseAreaSquare = houseAreaSquare;
        }

        public void houseDescription() {
            System.out.println(HOUSE_TYPE_PRINT);
            System.out.println(ID_PRINT + houseId);
            System.out.println(PRICE_PRINT + housePrice);
            System.out.println(ADDRESS_PRINT + houseAddress);
            System.out.println(AREA_SQUARE_PRINT + houseAreaSquare);
            System.out.println(SQUARE_PRINT + houseSquare);
            System.out.println(ROOMS_NUMBER_PRINT + houseNumberOfRooms);
            System.out.println(IS_SOLD_PRINT + houseIsSold);
            System.out.println(EMPTY_RAW_PRINT);
        }
    }
}

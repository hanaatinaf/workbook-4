package com.plursalsight.HotelOperations;

public class Room {
    private int numOfBeds;
    private double price;
    private boolean isOccuppied;
    private  boolean isDirty;


    public Room(double price, int numOfBeds, boolean isOccuppied, boolean isDirty) {
        this.price = price;
        this.numOfBeds = numOfBeds;
        this.isOccuppied = isOccuppied;
        this.isDirty = isDirty;

    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        this.isDirty = dirty;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccuppied() {
        return isOccuppied;
    }

    public void setOccuppied(boolean occuppied) {
        isOccuppied = occuppied;
    }

    public boolean isAvailable() {
        return  !isOccuppied && !isDirty;
    }

    public  boolean  checkIn(){

            isDirty = true;
            isOccuppied = true;
            return  true;
    }
    public boolean checkout(){
        isDirty = false;

        return  true;

    }


}

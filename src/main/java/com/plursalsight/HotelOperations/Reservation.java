package com.plursalsight.HotelOperations;

public class Reservation {
   private String roomType;
   private  int numOfNights;
   private boolean isWeekednd;

    public Reservation(double recerviationTota, String roomType, double price, int numOfNights, boolean isWeekednd) {
       // this.recerviationTota = recerviationTota;
        this.roomType = roomType;
       // this.price = price;
        this.numOfNights = numOfNights;
        this.isWeekednd = isWeekednd;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if (roomType == "King"){

        }

        this.roomType = roomType;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekednd() {
        return isWeekednd;
    }

    public void setWeekednd(boolean weekednd) {
        isWeekednd = weekednd;
    }


}

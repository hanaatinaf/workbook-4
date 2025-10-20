package com.plursalsight.HotelOperations;

public class Reservation {
   private String roomType;
   private  int numOfNights;
   private boolean isWeekedend;

    public Reservation(String roomType, int numOfNights, boolean isWeekedend) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.isWeekedend = isWeekedend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if (roomType.equalsIgnoreCase("King") || roomType.equalsIgnoreCase("Double")){
            this.roomType = roomType;
        }
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekedend() {
        return isWeekedend;
    }

    public void setWeekednd(boolean weekedend) {
        isWeekedend = weekedend;
    }

    public double getPrice(){
        double price = (roomType.equalsIgnoreCase("King"))? 139: 124 ;
        if (isWeekedend){
            return  price * 1.10;
        }
        else {
            return price;
        }
    }
    public  double getReservationTotal(){

        return getPrice() * numOfNights;

    }


}

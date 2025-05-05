public class Reservation {
   private String roomType;
   private double price;
   private boolean isWeekend;
   private int numberOfNight;


    public Reservation(String roomType, double price, boolean isWeekend,int numberOfNight) {
        this.roomType = roomType;
        this.price = price;
        this.isWeekend = isWeekend;
        this.numberOfNight=numberOfNight;
        if (roomType.equalsIgnoreCase("king")){
            price=139.00;

        } else if (roomType.equalsIgnoreCase("double")) {
            price=124.00;

        }
        if (isWeekend){
            price=price*1.10;//add 10%
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }
    public int getNumberOfNight(){
        return numberOfNight;
    }
    public void setNumberOfNight(int numberOfNight){
        this.numberOfNight=numberOfNight;
    }


    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
    public double getReservationTotal(){
        return price * numberOfNight;
    }

}

import java.time.Duration;
import java.time.LocalDateTime;

public class Room {
        private int numberOfBeds;
        private double price;
        private boolean isOccupied;
        private boolean isDirty;

        public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
            this.numberOfBeds = numberOfBeds;
            this.price = price;
            this.isOccupied = isOccupied;
            this.isDirty=isDirty;
        }

        public int getNumberOfBeds() {
            return numberOfBeds;
        }

        public double getPrice() {
            return price;
        }

        public boolean isOccupied() {
            return isOccupied;
        }

        public boolean isAvailable() {
          return !isDirty && !isOccupied;

        }
        public boolean isDirty(){
            return isDirty;
        }
        public boolean checkIn(){
            if (!isOccupied&&!isDirty){
                isOccupied=true;
                isDirty=true;
                System.out.println("Guest checked in.");
                return  true;
            }
            else {
                System.out.println(" Room not available for check-in. ");
                return false;
            }
        }
        public boolean checkOut(){
          if (isOccupied){
              isOccupied=false;
              System.out.println("Guest checked out");
              return true;

          }
          else {
              System.out.println("Room is already empty.");
              return false;
          }
        }
        public boolean cleanRoom(){
            if (isDirty&&!isOccupied){
                isDirty=false;
                System.out.println("Room cleaned.");
                return true;

            }
            else {
                System.out.println(" not allowed to clean");
                return false;
            }
        }



    }



public class Hotel {
private String name;
private int numberOfSuites;
private int numberOfRooms;
private int bookedSuites;
private int bookedBasicRooms;

    public Hotel(int bookedBasicRooms, int bookedSuites, int numberOfRooms, int numberOfSuites, String name) {
        this.bookedBasicRooms = bookedBasicRooms;
        this.bookedSuites = bookedSuites;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this.name = name;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }


        public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
    public int getAvailableSuites(){
      return numberOfSuites-bookedSuites;
    }
    public int getAvailableRooms(){
        return numberOfRooms-bookedBasicRooms;
    }


    public boolean bookRoom(int numberOfRooms,boolean isSuite){
        if (isSuite){
            if (getAvailableSuites()>=numberOfRooms){
                bookedSuites+=numberOfRooms;
                return true;

            }else {
                return false;
            }

        }else {
            if (getAvailableRooms()>=numberOfRooms){
                bookedBasicRooms+=numberOfRooms;
                return true;
            }else {
                return false;
            }
        }

    }
}

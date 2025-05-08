import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {


    @org.junit.jupiter.api.Test
    void testCheckInFailOccupiedDirty() {
        //Arrange
        Room room = new Room(2, 70, true, true);
        //Act
        boolean actual = room.checkIn();
        // Assert
        assertFalse(actual);




    }
    @Test
    void testCheckIn(){
        Room room=new Room(2,70,false,false);
        boolean actual=room.checkIn();
        assertTrue(actual);

    }

    @org.junit.jupiter.api.Test
    void testCheckOut() {
        Room room = new Room(3, 70, true, true);
        boolean actual=room.checkOut();
        assertTrue(actual);


    }

    @org.junit.jupiter.api.Test
    void testCleanRoom() {
        Room room = new Room(4, 100, false, true);
        boolean actual=room.cleanRoom();
        assertTrue(actual);
    }
    @Test
    void testCleanRoomFailOccupied(){
        Room room = new Room(4, 100, true, true);
        boolean actual=room.cleanRoom();
        assertFalse(actual);


    }

}
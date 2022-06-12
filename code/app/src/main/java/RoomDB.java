import java.util.ArrayList;

public class RoomDB {

    private ArrayList<OnlineRoom> activeRooms;

    // Checks for valid Room Code.
    // For the purposes of this example, the method returns true.
    public boolean checkCode(String code) {

        return true;
    }

    public void addRoom(OnlineRoom room) {

        this.activeRooms.add(room);
    }

    // Another dummy method. Does Nothing.
    public void reserveCode(String code) {
        ;
    }

}

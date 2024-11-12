import java.util.List;

public class Floor {
    public int number;
    public List<Room> rooms;

    public Floor(int number, List<Room> rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public String to_string() {
        return null;
    }
}

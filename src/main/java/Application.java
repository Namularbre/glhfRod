import java.util.*;
import java.util.ArrayList;

public static void main(String[] args) throws WaifuException {
    System.out.println("Hello rod, welcome to hell, GLHF !");

    Room r10 = new Room(10, "Room 10", true, null);
    Room r11 = new Room(11, "Room 11", false, new Waifu("Me", 23));
    Room r100 = new Room(100, "Room 100", false, null);
    Room r101 = new Room(101, "Room 100", false, new Waifu("Astolfo", 17));

    List<Room> roomsF1 = new ArrayList<>();
    roomsF1.add(r10);
    roomsF1.add(r11);
    roomsF1.add(r100);

    List<Room> roomsF2 = new ArrayList<>();
    roomsF2.add(r100);
    roomsF2.add(r101);

    Floor f1 = new Floor(1, roomsF1);
    Floor f2 = new Floor(2, roomsF2);

    List<Floor> floors = new ArrayList<>();
    floors.add(f1);
    floors.add(f2);

    Hell paradise = new Hell(floors);

    Floor f = paradise.getFloor("-1");

    System.out.println(f.to_string());
    System.err.println(paradise.toString());
}

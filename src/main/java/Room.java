public class Room {
    public int number;
    public String name;
    public boolean occupied;
    public Waifu waifu;

    public Room(int number, String name, boolean occupied, Waifu waifu) {
        this.number = number;
        this.name = name;

        if (waifu != null) {
            this.occupied = occupied ? true : false;
        } else {
            this.occupied = occupied ? true : false;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}

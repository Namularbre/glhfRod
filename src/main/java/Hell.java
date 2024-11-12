import java.util.List;

public class Hell {
    public List<Floor> floors;

    public Hell(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        String str = null;
        for (Floor floor : floors) {
            str = floor.toString();
        }

        return str;
    }

    public Floor getFloor(String number) {
        int i = (int) number.charAt(0);
        return floors.get(i);
    }
}

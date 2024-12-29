import java.util.Comparator;

public class PlaceToVisit {
    private String name;
    private int distance;

    public PlaceToVisit(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return name + ", " +distance;
    }
}

class CustomComparator implements Comparator<PlaceToVisit> {
    @Override
    public int compare(PlaceToVisit obj1, PlaceToVisit obj2) {
        // Compare the integer field of the objects
        return Integer.compare(obj1.getDistance(), obj2.getDistance());
    }
}

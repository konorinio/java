package travel;

import java.util.Comparator;

public class DistanceComparator implements Comparator<Destination> {
    public int compare(Destination o1, Destination o2) {
        return Integer.compare(o1.getDistance(), o2.getDistance());
    }
}

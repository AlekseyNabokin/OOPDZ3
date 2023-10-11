import java.util.Comparator;

public class StreamComparator implements Comparator {
    public int compare(Stream stream1,Stream stream2){
        int numberOfGroups1 = stream1.hashCode();
        int numberOfGroups2 = stream2.hashCode();
        return Integer.compare(numberOfGroups1,numberOfGroups2);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

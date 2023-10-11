import java.util.Comparator;
import java.util.List;

public class ServiceFlow {
    public void sortGroup(List<Stream> streams){
        streams.sort((Comparator<? super Stream>) new StreamComparator());
    }
}

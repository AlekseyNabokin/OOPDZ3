import java.util.List;

public class Сontroller {
    private ServiceFlow serviceFlow;
    public Сontroller(ServiceFlow serviceFlow){
        this.serviceFlow = serviceFlow;
    }
    public void sortGroup(List<Stream> streams){
        serviceFlow.sortGroup(streams);
    }
}

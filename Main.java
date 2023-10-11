import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("Group 1");

        StudentGroup group2 = new StudentGroup("Group 2");

        StudentGroup group3 = new StudentGroup("Group 3");


        Stream stream1 = new Stream();

        stream1.addGroup(group1);

        stream1.addGroup(group2);


        Stream stream2 = new Stream();

        stream2.addGroup(group3);


        ServiceFlow serviceFlow = new ServiceFlow();

        Сontroller controller = new Сontroller (serviceFlow);


        List<Stream> streams = new ArrayList<>();

        streams.add(stream1);

        streams.add(stream2);

        controller.sortGroup(streams);


        for (Stream stream : streams) {

            System.out.println("Stream:");

            for (StudentGroup group : stream) {

                System.out.println("-" + group.getName());

            }

        }

    }

}
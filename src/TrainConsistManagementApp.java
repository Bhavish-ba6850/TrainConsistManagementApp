import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "(" + capacity + ")";
    }
}




public class TrainConsistManagementApp {


    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 90));

        int threshold = 60;

        // =========================
        // LOOP BASED FILTERING
        // =========================
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > threshold) {
                loopResult.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // =========================
        // STREAM BASED FILTERING
        // =========================
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // =========================
        // OUTPUT RESULTS
        // =========================
        System.out.println("\nLoop Result: " + loopResult);
        System.out.println("Loop Time (ns): " + loopTime);

        System.out.println("\nStream Result: " + streamResult);
        System.out.println("Stream Time (ns): " + streamTime);

        System.out.println("\nResults Match: " + loopResult.equals(streamResult));
    }
}

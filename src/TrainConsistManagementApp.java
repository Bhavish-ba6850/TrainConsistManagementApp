

public class TrainConsistManagementApp {


    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        int[] capacities = {72, 56, 24, 70, 60};

        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Passenger Bogie Capacities:");

        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }
    }
}

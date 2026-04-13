import java.util.ArrayList;
import java.util.List;
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}



public class TrainConsistManagementApp {


    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Coal"));
        goodsBogies.add(new GoodsBogie("Open", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Safety compliance check using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✔");
        } else {
            System.out.println("\nTrain is NOT SAFE ✘");
        }
    }
}

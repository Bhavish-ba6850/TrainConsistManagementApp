class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    void assignCargo(String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum not allowed in Rectangular bogie");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo + " -> " + shape);
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment process completed for " + shape);
        }
    }
}

public class TrainConsistManagementApp {


    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");
        b2.assignCargo("Petroleum");

        System.out.println("\nProgram continues safely...");
    }
}

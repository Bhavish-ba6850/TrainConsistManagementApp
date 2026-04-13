import java.util.regex.Pattern;
import java.util.regex.Matcher;




public class TrainConsistManagementApp {


    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (can be replaced with Scanner input if needed)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID: " + trainId);
        } else {
            System.out.println("Train ID is INVALID: " + trainId);
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID: " + cargoCode);
        } else {
            System.out.println("Cargo Code is INVALID: " + cargoCode);
        }
    }
}

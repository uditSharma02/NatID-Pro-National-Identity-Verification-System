import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class NationalIDApp {

    static Map<String, Citizen> memoryDatabase = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== NATIONAL ID REGISTRY SYSTEM (CSV) ===");

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Register New Citizen");
            System.out.println("2. Search Citizen by ID");
            System.out.println("3. Update Citizen Details");
            System.out.println("4. Delete Citizen");
            System.out.println("5. List All Registered Citizens");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1": registerUser(); break;
                case "2": searchUser(); break;
                case "3": updateCitizen(); break;
                case "4": deleteCitizen(); break;
                case "5": listAllCitizens(); break;
                case "6": System.out.println("Exiting..."); return;
                default: System.out.println("Invalid Choice!");
            }
        }
    }

    private static void registerUser() {
        System.out.println("\n--- ENTER CITIZEN DETAILS ---");

        System.out.print("1. Full Name: ");
        String name = scanner.nextLine();

        System.out.print("2. Age: ");
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Age. Setting to 0.");
        }

        System.out.print("3. Date of Birth (DD/MM/YYYY): ");
        String dob = scanner.nextLine();

        System.out.print("4. Gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.print("5. Marital Status (Married/Unmarried): ");
        String maritalStatus = scanner.nextLine();


        String relativeInfo;
        
        if (maritalStatus.equalsIgnoreCase("Married")) {
            if (gender.equalsIgnoreCase("Male")) {
                System.out.print("6. Wife's Name: ");
                relativeInfo = "Wife: " + scanner.nextLine();
            } else if (gender.equalsIgnoreCase("Female")) {
                System.out.print("6. Husband's Name: ");
                relativeInfo = "Husband: " + scanner.nextLine();
            } else {
               
                System.out.print("6. Spouse's Name: ");
                relativeInfo = "Spouse: " + scanner.nextLine();
            }
        } else {
           
            System.out.print("6. Father's Name: ");
            relativeInfo = "Father: " + scanner.nextLine();
        }

        System.out.print("7. Address: ");
        String address = scanner.nextLine();

        System.out.print("8. Pincode: ");
        String pincode = scanner.nextLine();

        System.out.print("9. State: ");
        String state = scanner.nextLine();

        System.out.print("10. Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("11. Email ID: ");
        String email = scanner.nextLine();

        System.out.print("12. Mother Tongue: ");
        String lang = scanner.nextLine();

        System.out.print("13. No. of Family Members: ");
        int familyCount = 1;
        try {
            familyCount = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Setting to 1.");
        }

        System.out.print("14. ID Proof Number: ");
        String proof = scanner.nextLine();

        String newId = generateId(); 

        Citizen newCitizen = new Citizen(name, age, dob, gender, maritalStatus, relativeInfo,
                address, pincode, state, email, phoneNumber, lang,
                familyCount, proof, newId);

        memoryDatabase.put(newId, newCitizen);
        FileHandler.saveCitizen(newCitizen);

        System.out.println("\n--------------------------------");
        System.out.println("REGISTRATION COMPLETE!");
        System.out.println("Generated National ID: " + newId);
        System.out.println("--------------------------------");
    }

    private static void searchUser() {
        System.out.print("Enter ID to search: ");
        String id = scanner.nextLine();

        Citizen c = memoryDatabase.get(id);
        if (c != null) {
            System.out.println("\nFOUND CITIZEN:");
            System.out.println(c);
            System.out.println("Rel: " + c.getRelativeName());
            System.out.println("Email: " + c.getEmail());
            System.out.println("Phone: " + c.getPhoneNumber());
        } else {
            System.out.println("ID not found in active session.");
        }
    }

    private static void deleteCitizen() {
        System.out.print("Enter ID to DELETE: ");
        String id = scanner.nextLine();

        if (memoryDatabase.containsKey(id)) {
            Citizen removed = memoryDatabase.remove(id);
            System.out.println("\n[SUCCESS] Citizen " + removed.getFullName() + " removed from active registry.");
            System.out.println("(Note: The CSV record remains for historical audit)");
        } else {
            System.out.println("[ERROR] ID not found.");
        }
    }

    private static void updateCitizen() {
        System.out.print("Enter ID to update: ");
        String id = scanner.nextLine();

        Citizen c = memoryDatabase.get(id);
        if (c == null) {
            System.out.println("Citizen not found.");
            return;
        }

        System.out.println("\nWhat do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Address");
        System.out.println("3. Phone Number");
        System.out.print("Choose: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.print("Enter New Name: ");
                c.setFullName(scanner.nextLine());
                break;
            case "2":
                System.out.print("Enter New Address: ");
                c.setAddress(scanner.nextLine());
                break;
            case "3":
                System.out.print("Enter New Phone Number: ");
                c.setPhoneNumber(scanner.nextLine());
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.println("Update successful!");
    }

    private static void listAllCitizens() {
        if (memoryDatabase.isEmpty()) {
            System.out.println("No citizens registered yet.");
            return;
        }

        System.out.println("\n=== REGISTERED CITIZENS ===");
        for (Citizen c : memoryDatabase.values()) {
            System.out.println(c);
        }
    }

    private static String generateId() {
        Random rand = new Random();
        
        String id = "" + (rand.nextInt(9) + 1); 
        for (int i = 0; i < 6; i++) {
            id += rand.nextInt(10);
        }
        return id;
    }
}
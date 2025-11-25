import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class FileHandler {

    private static final String FILE_NAME = "citizens.csv";

    public static void saveCitizen(Citizen c) {
        
        
        boolean fileExists = new File(FILE_NAME).exists();

        try {
            FileWriter writer = new FileWriter(FILE_NAME, true);
            
            
            if (!fileExists) {
               
                writer.write("NationalID, Name, Age, DOB, Gender, MaritalStatus, Relation, Phone, Email, Address, Pincode,State, MotherTongue, FamilyMembers, IDProof, DateRegistered\n");
            }

            
            String csvRow = 
                c.getNationalId() + "," +
                c.getFullName() + "," +
                c.getAge() + "," +
                c.getDob() + "," +
                c.getGender() + "," +
                c.getMaritalStatus() + "," +
                c.getRelativeName() + "," +
                c.getPhoneNumber() + "," +
                c.getEmail() + "," +
                c.getAddress().replace(",", " ") + "," + 
                c.getPincode() + "," +
                c.getState() + "," +
                c.getMotherTongue() + "," +
                c.getFamilyMembers() + "," +
                c.getIdProofNumber() + "," +
                c.getRegistrationTime() + "\n";
            
            writer.write(csvRow);
            writer.close();
            
            System.out.println(">> SUCCESS: Data saved to " + FILE_NAME);
            
        } catch (IOException e) {
            System.out.println(">> ERROR: Could not save to CSV. " + e.getMessage());
        }
    }
}
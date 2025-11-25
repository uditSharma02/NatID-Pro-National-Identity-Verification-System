import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Citizen {

    private String fullName;
    private int age;
    private String dob;
    private String gender;
    private String maritalStatus;
    private String relativeName;

    private String address;
    private String pincode;
    private String state;
    
    private String email;
    private String phoneNumber;

    private String motherTongue;
    private int familyMembers;

    private String idProofNumber;
    private String nationalId;

    private String registrationTime;

    public Citizen(String fullName, int age, String dob, String gender, String maritalStatus, String relativeName,
                   String address, String pincode, String state, String email, String phoneNumber,
                   String motherTongue, int familyMembers, String idProofNumber,
                   String nationalId) {

        this.fullName = fullName;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.relativeName = relativeName;
        this.address = address;
        this.pincode = pincode;
        this.state = state;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.motherTongue = motherTongue;
        this.familyMembers = familyMembers;
        this.idProofNumber = idProofNumber;
        this.nationalId = nationalId;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.registrationTime = dtf.format(LocalDateTime.now());
    }

    // GETTERS
    public String getNationalId() { return nationalId; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public String getDob() { return dob; }
    public String getGender() { return gender; }
    public String getMaritalStatus() { return maritalStatus; }
    public String getRelativeName() { return relativeName; }
    public String getAddress() { return address; }
    public String getPincode() { return pincode; }
    public String getState() { return state; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getMotherTongue() { return motherTongue; }
    public int getFamilyMembers() { return familyMembers; }
    public String getIdProofNumber() { return idProofNumber; }
    public String getRegistrationTime() { return registrationTime; }

    // SETTERS
    public void setFullName(String name) { this.fullName = name; }
    public void setDob(String dob) { this.dob = dob; }
    public void setAddress(String address) { this.address = address; }
    public void setPincode(String pincode) { this.pincode = pincode; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "ID: " + nationalId + " | Name: " + fullName + " | Phone: " + phoneNumber;
    }
}
package jdbc.components;

public class ParticipantPojo {
    private int age;
    private String email;
    private String participant;
    private String time; // Consider changing to LocalDateTime if applicable
    private String phoneNumber;

    // Default constructor
    public ParticipantPojo() {
    }

    // Parameterized constructor
    public ParticipantPojo(String participant, String time, String phoneNumber) {
        this.participant = participant;
        this.time = time;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getParticipant() {
        return participant;
    }

    public String getTime() {
        return time;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // hashCode, equals, and toString methods remain the same
}

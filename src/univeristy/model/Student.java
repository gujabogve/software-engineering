package univeristy.model;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String id;
    private LocalDate birthDate;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append("\n");
        sb.append(lastName).append("\n");
        sb.append(id).append("\n");
        sb.append(email).append("\n");
        sb.append(birthDate).append("\n");
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthDate(String birthDate) {
        //TODO must be implemented
    }
}

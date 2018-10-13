package university;

public class Student extends Person {

    public String getFullName() {

        return this.getFirstName() + ' ' + this.getLastName();

    }

}

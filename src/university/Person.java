package university;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    private String firstName, lastName;

    private Date birthday;

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Person setBirthday(String birthday) throws ParseException {
        SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd");
        this.birthday = dateParser.parse(birthday);
        return this;
    }

}

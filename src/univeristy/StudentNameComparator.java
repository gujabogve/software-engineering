package univeristy;

import univeristy.model.Student;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}

package univeristy.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("\n");
        for (Student s: students) {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}

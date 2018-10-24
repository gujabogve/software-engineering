package univeristy;

import univeristy.model.Faculty;
import univeristy.model.University;

import java.util.Arrays;
import java.util.Collections;

public class UniversityProcessor {
    public static University process(University u) {
        for (Faculty f: u.getFacultyList()) {
            Collections.sort(f.getStudents(), new StudentNameComparator());
        }
        return u;
    }
}

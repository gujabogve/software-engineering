package univeristy.io;

import univeristy.model.Faculty;
import univeristy.model.Student;
import univeristy.model.University;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class UniversityReader {
    public static University read(String pathToFile) {
        University u = new University();
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathToFile));
            u.setNickName(lines.get(0).substring(0, lines.get(0).indexOf(";")));
            u.setFullName(lines.get(0).substring(lines.get(0).indexOf(";")+1));
            int lineNumber = 1;
            while(lineNumber < lines.size()) {
                Faculty f = new Faculty();
                f.setName(lines.get(lineNumber));
                lineNumber++;
                while(lineNumber < lines.size()) {
                    if(lines.get(lineNumber).contains(";")) {
                        Student s = new Student();
                        String[] studentArray = lines.get(lineNumber).split(";");
                        s.setFirstName(studentArray[0]);
                        s.setLastName(studentArray[1]);
                        s.setId(studentArray[2]);
                        s.setEmail(studentArray[3]);
                        s.setBirthDate(studentArray[4]);
                        f.getStudents().add(s);
                        lineNumber++;
                    } else {
                        break;
                    }
                }
                u.getFacultyList().add(f);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return u;
    }
}

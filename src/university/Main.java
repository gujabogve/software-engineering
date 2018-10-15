package university;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        University university = new University();
        university.setLecturers(Faker.lecturers(10));
        university.setStudents(Faker.students(100));
        university.setRooms(Faker.rooms(999));
        university.setFaculties(Faker.facultis(10, university.getLecturers(), university.getRooms()));

        for (Student student : university.getStudents()) {
            System.out.printf("%s %s \n", student.getFullName(), student.getBirthday());
        }

    }
}
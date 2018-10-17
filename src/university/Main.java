package university;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        University uni = new University();
        uni.setLecturers(Faker.lecturers(10));
        uni.setStudents(Faker.students(100));
        uni.setRooms(Faker.rooms(999));
        uni.setFaculties(Faker.facultis(10, uni.getLecturers(), uni.getStudents(), uni.getRooms()));

        for (Student student : uni.getStudents()) {
            System.out.printf("%s %s \n", student.getFullName(), student.getBirthday());
        }

    }
}
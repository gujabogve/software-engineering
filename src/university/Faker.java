package university;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Faker {

    public static List<Student> students(int n) throws ParseException {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Student student = new Student();
            student.setFirstName("student" + i)
                    .setLastName("student" + i)
                    .setBirthday(LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70)))).toString());
            students.add(student);
        }
        return students;
    }

    public static List<Lecturer> lecturers(int n) throws ParseException {
        List<Lecturer> lecturers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            Lecturer lecturer = new Lecturer();
            lecturer.setFirstName("student" + i)
                    .setLastName("student" + i)
                    .setBirthday(LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70)))).toString());
            lecturers.add(lecturer);
        }
        return lecturers;
    }

    public static List<Faculty> facultis(int n, List<Lecturer> lecturers, List<Student> students, List<Room> rooms) {
        List<Faculty> faculties = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int rand = (new Random()).nextInt(students.size()) + 1;
            Faculty faculty = new Faculty();
            faculty.setName("faculty" + i);
            faculty.setLectures(lectures(rand, lecturers, rooms));
            faculties.add(faculty);
        }
        return faculties;
    }

    public static List<Lecture> lectures(int n, List<Lecturer> lecturers, List<Room> rooms) {
        List<Lecture> lectures = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int lecturer = (new Random()).nextInt(lecturers.size()) + 1;
            int room = (new Random()).nextInt(rooms.size()) + 1;
            Lecture lecture = new Lecture();
            lecture.setLecturer(lecturers.get(lecturer - 1));
            lecture.setName("lecture" + i);
            lecture.setRoom(rooms.get(room - 1));
            lectures.add(lecture);
        }
        return lectures;
    }

    public static List<Room> rooms(int n) {
        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            int seats = (new Random()).nextInt(50) + 1;
            Room room = new Room();
            room.setWhiteBoard(Math.random() < 0.5);
            room.setSmartBoard(Math.random() < 0.5);
            room.setBlackBoard(Math.random() < 0.5);
            room.setComputers(Math.random() < 0.5);
            room.setSeats(seats);
            room.setNumber(i);
            rooms.add(room);
        }
        return rooms;
    }
}

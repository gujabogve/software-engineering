package univeristy;

import univeristy.io.UniversityReader;
import univeristy.model.University;

import java.util.List;

public class Cda {

    public static void main(String[] args) {
        University u = UniversityReader.read("c:/dev/masterclass/university.txt");
        u = UniversityProcessor.process(u);
        System.out.println(u);
    }

}

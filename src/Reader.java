import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Guja\\IdeaProjects\\studenti\\res\\students.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}

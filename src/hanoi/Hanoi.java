package hanoi;

public class Hanoi {

    public void move(int n, int from, int to) {
        if (n == 1) {
            System.out.println("From " + from + ", To " + to );
        } else {
            move(n-1,  from, 6 - from - to);
            move(1, from, to);
            move(n-1,  6 - from - to, to);
        }
    }

    public static void main(String[] args) {

        Hanoi hanoi = new Hanoi();
        hanoi.move(100, 1, 3);

    }
}

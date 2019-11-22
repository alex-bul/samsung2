import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        Drob drob = new Drob(first,second);
        System.out.println(drob.ipart());
    }
}

import java.util.Scanner;

public class InmultiriTabla {
    public static void main(String[] args) {
        System.out.println("Tabla inmultiri");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        for (i = 1; i <= 9; i++) {
            System.out.print(i + "x" + n + "=" + i * n);
            i++;
        }

    }
}

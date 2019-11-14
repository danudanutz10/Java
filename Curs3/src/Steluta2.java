import static java.lang.Thread.*;

public class Steluta2 {
    public static void main(String[] args) {
        int ps = 10;
        for (ps = 1; ps <= 80; ps++)
            System.out.print("\r");
            for (int i = 1; i <= ps; i++) {
                System.out.print(" ");
            }
        System.out.print("*");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



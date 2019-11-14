public class DoWhile {
    public static void main(String[] args) {
        int n = 5;
        while (n >= 2) {
            System.out.println(n);
            n--;
        }
        int money = 5;
        int ciocolata = 0;
        int chocholatePrices = 1;
        while (money > chocholatePrices) {
            ciocolata++;
            money -= chocholatePrices;}
            System.out.println("I have " + ciocolata + "ciocolata");
        }
    }



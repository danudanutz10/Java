public class Chco {
    public static void main(String[] args) {
        int money = 0;
        int ciocolata = 0;
        int price = 1;
        do {
            ciocolata++;
            money -= price;
        } while (money > price);
        System.out.println(ciocolata);
        System.out.println(money);

    }
}


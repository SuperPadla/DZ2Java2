public class Main {
    public static void main(String[] args) {

        int balance = 250; // начальный счёт
        int resupply = 1350; // сумма пополнения
        int bonus = 1;

        if (resupply >= 1000) {
            System.out.println("Ваш баланс: " + (balance + resupply + (resupply / 100 * bonus)) + " руб.");
        } else {
            System.out.println("Ваш баланс: " + (balance + resupply) + " руб.");
        }
    }
}
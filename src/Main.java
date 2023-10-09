import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько у Вас денег на проезд :");
        int money = scanner.nextInt();
        try {
            int remains = isEnough(money);
            System.out.println("Счастливого пути! \nУ Вас осталось " + remains);
        } catch (MoneyException e) {
            System.out.println("Проезд стоит 32 рубля. У Вас не хватает денег.");
            e.printStackTrace();
        }

    }

    private static int isEnough(int money) throws MoneyException {
        if (money < 32) {
            throw new MoneyException("К сожалению, Вам не хватает " + (32 - money) + " рублей");
        }
        return money - 32;
    }
}
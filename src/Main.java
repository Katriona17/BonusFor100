public class Main {
    public static void main(String[] args) {
        int account = 100;
        int payIn = 1000;
        int bonus = payIn / 100;
        int result = account + payIn + bonus;
        if (payIn >= 1000) {
            System.out.println("Ваш текущий баланс: " + result + " Сумма бонусов: " + bonus);
        }
        if (payIn < 1000) {
            System.out.println("Вы внесли на счет сумму меньше 1000р., бонусы не начислены");
        }

    }
}

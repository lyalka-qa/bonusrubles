public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int transfer = 1255;
        int rubles = 100;
        int bonus = 1;
        if (transfer >= 1000) {
            bonus = 1;
                    }
        else {
            bonus = 0;
        }
        int totalBonus = bonus * transfer / rubles;
        int totalBalance = balance + transfer + totalBonus;
        System.out.println(totalBonus);
        System.out.println(totalBalance);
    }
}

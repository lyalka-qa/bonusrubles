public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int transfer = 1357;
        int rubles = 100;
        int bonus = 1;
        int finalBalance = balance + transfer;
        if (finalBalance >= 1000) {
            bonus = 1;
                    }
        else {
            bonus = 0;
        }
        int totalBonus = bonus * finalBalance / rubles;
        System.out.println(totalBonus);
    }
}

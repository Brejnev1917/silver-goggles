public class main {
    public static void main(String[] args) {
        int balance = 100;
        int income = 1100;
        int bonus = balance + income / 100;
        if (income > 1000) {
            bonus = balance + income / 100;
        } else {
            bonus = 0;
        }
        int total = (bonus + income);
        System.out.println(total);
    }
}


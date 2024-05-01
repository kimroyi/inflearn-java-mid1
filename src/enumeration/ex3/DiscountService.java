package enumeration.ex3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int disoutPercent = 0;

        if (grade == Grade.BASIC) {
            disoutPercent = 10;
        } else if (grade == Grade.GOLD) {
            disoutPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            disoutPercent = 30;
        } else {
            System.out.println("할인X");
        }

        // 10000 * (20 / 100) -> 2000원
        return price * disoutPercent / 100;
    }
}

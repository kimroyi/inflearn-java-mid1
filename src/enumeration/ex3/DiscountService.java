package enumeration.ex3;

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int disoutPercent = 0;

        if (classGrade == Grade.BASIC) {
            disoutPercent = 10;
        } else if (classGrade == Grade.GOLD) {
            disoutPercent = 20;
        } else if (classGrade == Grade.DIAMOND) {
            disoutPercent = 30;
        } else {
            System.out.println("할인X");
        }

        // 10000 * (20 / 100) -> 2000원
        return price * disoutPercent / 100;
    }
}

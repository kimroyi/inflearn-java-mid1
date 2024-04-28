package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        int disoutPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            disoutPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            disoutPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            disoutPercent = 30;
        } else {
            System.out.println("할인X");
        }

        // 10000 * (20 / 100) -> 2000원
        return price * disoutPercent / 100;
    }
}

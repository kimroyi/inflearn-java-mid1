package enumeration.ex1;

public class DiscountService {

    public int discount(String grade, int price) {
        int disoutPercent = 0;

        if (grade.equals(StringGrade.BASIC)) {
            disoutPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            disoutPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            disoutPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }

        // 10000 * (20 / 100) -> 2000원
        return price * disoutPercent / 100;
    }
}

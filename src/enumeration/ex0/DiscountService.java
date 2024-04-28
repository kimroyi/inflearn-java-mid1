package enumeration.ex0;

public class DiscountService {

    public int discount(String grade, int price) {
        int disoutPercent = 0;

        if (grade.equals("BASIC")) {
            disoutPercent = 10;
        } else if (grade.equals("GOLD")) {
            disoutPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            disoutPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }

        // 10000 * (20 / 100) -> 2000원
        return price * disoutPercent / 100;
    }
}

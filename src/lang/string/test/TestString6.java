package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);

        // 내가 푼것
//        int count = 0;
//        String[] strArr = str.split(",");
//
//        for (String s : strArr) {
//            if (s.indexOf("hello") != -1) {
//                count++;
//            }
//        }
//
//        System.out.println("count = " + count);
    }
}

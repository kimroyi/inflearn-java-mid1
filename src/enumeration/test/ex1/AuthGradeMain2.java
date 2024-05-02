package enumeration.test.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }

        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }

        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }


        // 내가 푼 것
//        Scanner sc = new Scanner(System.in);
//        AuthGrade[] authGrades = AuthGrade.values();
//        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(authGrades) + ": ");
//        String grade = sc.nextLine();
//
//        AuthGrade authGrade = AuthGrade.valueOf(grade);
//        String description = authGrade.getDescription();
//        System.out.println("당신의 등급은 " + description + "입니다.");
//        System.out.println("==메뉴 목록==");
//
//        switch (authGrade) {
//            case GUEST:
//                System.out.println("- 메인 화면");
//                break;
//            case LOGIN:
//                System.out.println("- 메인 화면 \n- 이메일 관리 화면");
//                break;
//            case ADMIN:
//                System.out.println("- 메인 화면 \n- 이메일 관리 화면 \n- 관리자 화면");
//                break;
//        }
    }
}

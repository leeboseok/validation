import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요: ");
        String pw = sc.nextLine();

        if (pw.length() < 8) {
            System.out.println("8자 이상이어야 합니다.");
        } else if (!pw.matches(".*[A-Za-z].*")) {
            System.out.println("영문자가 포함되어야 합니다.");
        } else if (!pw.matches(".*\\d.*")) {
            System.out.println("숫자가 포함되어야 합니다.");
        } else if (!pw.matches(".*[!@#$%^&*].*")) {
            System.out.println("특수문자가 포함되어야 합니다.");
        } else {
            System.out.println("강력한 비밀번호입니다.");
        }
    }
}

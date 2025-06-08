import java.util.Scanner;

public class SsnValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호 입력 (예: 950101-1234567): ");
        String input = sc.nextLine();

        if (input.matches("\\d{6}-\\d{7}")) {
            System.out.println("올바른 형식입니다.");
        } else {
            System.out.println("잘못된 형식입니다.");
        }
    }
}

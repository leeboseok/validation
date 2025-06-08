import java.util.Scanner;

public class AmountValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요: ");
        String input = sc.nextLine();

        if (input.matches("\\d+") && Integer.parseInt(input) > 0) {
            System.out.println("올바른 금액입니다.");
        } else {
            System.out.println("금액은 0보다 큰 숫자여야 합니다.");
        }
    }
}

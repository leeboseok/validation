import java.util.Scanner;

public class BirthdayValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("생년월일 입력 (예: 1995-05-28): ");
        String date = sc.nextLine();

        if (date.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
            System.out.println("형식이 올바릅니다.");
        } else {
            System.out.println("형식이 잘못되었습니다.");
        }
    }
}

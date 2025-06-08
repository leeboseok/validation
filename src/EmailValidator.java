import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이메일 주소를 입력하세요: ");
        String email = sc.nextLine();

        if (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("올바른 이메일입니다.");
        } else {
            System.out.println("잘못된 이메일 형식입니다.");
        }
    }
}

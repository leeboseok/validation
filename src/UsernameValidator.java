import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력하세요: ");
        String username = sc.nextLine();

        if (username.matches("^[a-zA-Z][a-zA-Z0-9]{4,11}$")) {
            System.out.println("올바른 아이디입니다.");
        } else {
            System.out.println("아이디는 영문자로 시작하고 5~12자여야 합니다.");
        }
    }
}

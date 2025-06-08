import java.util.Scanner;

public class NameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        if (name.matches("^[가-힣]{2,5}$")) {
            System.out.println("올바른 이름입니다.");
        } else {
            System.out.println("이름은 한글 2~5자여야 합니다.");
        }
    }
}

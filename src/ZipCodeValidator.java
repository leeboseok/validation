import java.util.Scanner;

public class ZipCodeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("우편번호를 입력하세요 (예: 12345): ");
        String zip = sc.nextLine();

        if (zip.matches("\\d{5}")) {
            System.out.println("올바른 우편번호입니다.");
        } else {
            System.out.println("우편번호는 숫자 5자리여야 합니다.");
        }
    }
}

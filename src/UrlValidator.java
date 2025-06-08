import java.util.Scanner;

public class UrlValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("URL을 입력하세요 (예: https://google.com): ");
        String url = sc.nextLine();

        if (url.startsWith("http://") || url.startsWith("https://")) {
            System.out.println("올바른 URL입니다.");
        } else {
            System.out.println("URL은 http:// 또는 https://로 시작해야 합니다.");
        }
    }
}

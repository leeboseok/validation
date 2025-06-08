import java.util.Scanner;

public class PhoneValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("전화번호를 입력하세요.");

        while(true){
            String phone = sc.nextLine();
            if(phone.matches("010-\\d[4]-\\d[4]")){
                System.out.println("올바른 형식입니다.");
                break;
            }else{
                System.out.println("올바른 형식으로 입력해주세요. 예시 010-1234-5678");
            }
        }
    }
}

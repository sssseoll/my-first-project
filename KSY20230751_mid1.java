import java.util.Scanner;

public class KSY20230751_mid1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 입력 받기
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 선택하세요:");
        int userChoice = scanner.nextInt();
        
        // 컴퓨터의 선택을 무작위로 생성
        int computerChoice = (int) (Math.random() * 3) + 1;
        
        // 사용자와 컴퓨터의 선택 출력
        System.out.print("사용자: ");
        printChoice(userChoice);
        System.out.print("컴퓨터: ");
        printChoice(computerChoice);
        
        // 결과 출력
        int result = determineWinner(userChoice, computerChoice);
        if (result == 0) {
            System.out.println("무승부입니다.");
        } else if (result == 1) {
            System.out.println("사용자가 이겼습니다!");
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
        }
        
        scanner.close();
    }
    
    // 선택에 따라 가위, 바위, 보를 출력하는 메서드
    public static void printChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
    
    // 승부 판정
    public static int determineWinner(int user, int computer) {
        // 가위(1), 바위(2), 보(3)
        // 1: 사용자 승리, 0: 무승부, -1: 컴퓨터 승리
        if (user == computer) {
            return 0;
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            return 1;
        } else {
            return -1;
        }
    }
}

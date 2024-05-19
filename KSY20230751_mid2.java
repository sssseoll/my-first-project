import java.util.Random;
import java.util.Scanner;

public class KSY20230751_mid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"묵", "찌", "빠"};
        
        System.out.println("묵찌빠 게임에 오신 것을 환영합니다!");
        System.out.println("묵(0), 찌(1), 빠(2) 중 하나를 선택하세요.");
        
        boolean gameOn = true;
        int lastWinner = -1; // 0: 사용자, 1: 컴퓨터, -1: 없음
        
        while (gameOn) {
            System.out.print("당신의 선택 (0-묵, 1-찌, 2-빠): ");
            int userChoice = scanner.nextInt();
            int computerChoice = random.nextInt(3);
            
            System.out.println("당신의 선택: " + choices[userChoice]);
            System.out.println("컴퓨터의 선택: " + choices[computerChoice]);
            
            if (userChoice == computerChoice) {
                if (lastWinner == 0) {
                    System.out.println("당신이 이겼습니다!");
                } else if (lastWinner == 1) {
                    System.out.println("컴퓨터가 이겼습니다!");
                } else {
                    System.out.println("비겼습니다. 다시 시작합니다.");
                }
                gameOn = false;
            } else if ((userChoice == 0 && computerChoice == 1) ||
                       (userChoice == 1 && computerChoice == 2) ||
                       (userChoice == 2 && computerChoice == 0)) {
                System.out.println("사용자가 이겼습니다! 공격을 계속하세요.");
                lastWinner = 0;
            } else {
                System.out.println("컴퓨터가 이겼습니다! 컴퓨터의 공격을 막으세요.");
                lastWinner = 1;
            }
        }
        
        scanner.close();
    }
}


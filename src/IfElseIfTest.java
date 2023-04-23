import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        // Q. 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반,
        // 그렇지 않으면 C반 으로 편성하고 점수가 80미만이면 불합격 처리하는 프로그램을 작성하세요
        // 단, 점수는 0~100 사잇값으로 입력받는다

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        if(score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("A반");
            } else if (score >= 85) {
                System.out.println("B반");
            } else if (score >= 80) {
                System.out.println("C반");
            } else {
                System.out.println("불합격"); // 0 ~ 79
            }
        } else {
            System.out.println("유효한 점수가 아닙니다.");
        }

        // Q. 년도를 입력 받아서 해당 년도가 윤년인지 아닌지를 판단하여 출력하는 코드를 작성하세요.
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }

    }
}

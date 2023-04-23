import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서정보 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.println("title = " + title);

        System.out.print("가격: ");
        int price = scanner.nextInt(); // 30000 _
        System.out.println("price = " + price);

        scanner.nextLine();

        System.out.print("출판사: ");
        String company = scanner.nextLine();
        System.out.println("company = " + company);

        System.out.print("페이지수: ");
        int page = scanner.nextInt(); // 700_
        System.out.println("page = " + page);

        scanner.nextLine();

        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("isbn = " + isbn);
    }
}

public class BookTest {
    public static void main(String[] args) {
        // Q. [정수] 한 개를 저장할 [변수를 선언] 하시오.
        int a;

        // Q. 한 권의 책 데이터를 저장하고 출력하시오. 6개의 변수로
        String title = "자바";
        int price = 30000;
        String company = "패스트캠퍼스";
        String author = "박매일";
        int page = 700;
        String isbn = "ISBN-111990011";
        System.out.println(title + "\t" + price + "\t" + company + "\t" + author + "\t" + page + "\t" + isbn);

        // Q. [책] 학 권을 저장할 [변수를 선언] 하시오.
        Book b;
        b = new Book();
        b.title = "자바";
        b.price = 30000;
    }
}

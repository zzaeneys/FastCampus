public class CharExam {
    public static void main(String[] args) {
        //Q. '1'+'2'+'3'+'4'+'5'=15이 나오도록 프로그래밍 하시오
        /*
        char a='1';
        char b='2';
        char c='3';
        char d='4';
        char e='5';

        int sum=(a-'0') + (b-'0') + (c-'0') + (d-'0') + (e-'0');
        System.out.println("sum = " + sum);
         */
        int sum=0; // '0' -> 48
        sum+=('1'-'0');
        sum+=('2'-'0');
        sum+=('3'-'0');
        sum+=('4'-'0');
        sum+=('5'-'0');
        System.out.println("sum = " + sum); // 15
        // System.out.println(); // 개행, 줄바꿈
    }
}

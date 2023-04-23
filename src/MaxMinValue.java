public class MaxMinValue {
    public static void main(String[] args) {
        // Q. 삼항 연산자를 이용하여 정수 2개 중 maxValue 와 minValue 를 출력하세요
        int a = 10;
        int b = 20;

        // minValue
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);

        // maxValue
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);
    }
}

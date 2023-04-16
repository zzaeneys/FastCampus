public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.date = "2022.12.14";
        m.hero = "제이크 설리";
        m.genre = "액션";
        m.runningTime = 192;
        m.grade = "12세";

        System.out.println(m.title + "\t" + m.date + "\t" + m.hero + "\t" + m.genre + "\t" + m.runningTime + "\t" + m.grade);

    }
}

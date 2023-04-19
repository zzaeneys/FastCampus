public class ObjectArrayExam {
    public static void main(String[] args) {
        // Q. 영화 3편을 저장할 [배열을 생성] 하고 영화 3편의 데이터를 저장하고 출력하세요
        Movie[] movies = new Movie[3];
        movies[0] = new Movie();
        movies[0].title = "아바타";

        movies[1] = new Movie();
        movies[1].title = "신의 선물";

        movies[2] = new Movie();
        movies[2].title = "어벤져스";

        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].title);
        }
    }
}

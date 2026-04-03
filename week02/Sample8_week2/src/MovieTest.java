public class MovieTest {
    public static void main(String[] args) {

        // movie1
        Movie movie1 = new Movie("헤라클레스", "레니할린", 2014, "켈란루츠", 6.9);

        // movie2
        Movie movie2 = new Movie("노아", "대런아로노프스키", 2004, "러셀크로우", 7.3);

        // 변경: movie2 평점을 8.2로 수정
        movie2.rankPoint = 8.2;

        // movie1과 movie2 정보 출력
        movie1.printMovie();
        movie2.printMovie();

        // movie1 감독 이름만 출력
        // "레니할린"에서 "할린"만 출력
        String director = movie1.director;
        if(director.length() >= 2) {
            System.out.println("movie1 감독 성: " + director.substring(director.length()-2));
        }
    }
}
class Movie {
    String title;      // 영화제목
    String director;   // 감독
    int open;          // 개봉년도
    String mainActor;  // 주연배우
    double rankPoint;  // 평점

    // 생성자 (constructor)
    Movie(String title, String director, int open, String mainActor, double rankPoint) {
        this.title = title;
        this.director = director;
        this.open = open;
        this.mainActor = mainActor;
        this.rankPoint = rankPoint;
    }

    // 영화 정보 출력 메소드
    void printMovie() {
        System.out.println("제목: " + title);
        System.out.println("감독: " + director);
        System.out.println("개봉: " + open);
        System.out.println("주연: " + mainActor);
        System.out.println("평점: " + rankPoint);
        System.out.println();
    }
}
public class HighSchool extends Student implements Project {
    public HighSchool(String studentID, String name) {
        super(studentID, name);
    }

    private int sum() {
        int sum = 0;
        for (int i = 0; i < parts.size(); i++)
            sum += parts.get(i).getScore();
        return sum;
    }

    @Override
    public double average() {
        return sum() / (double) parts.size();
    }

    @Override
    public String grade(double score) {
        String result = "";
        if (score >= A)
            result = "수";
        else if (score >= B)
            result = "우";
        else if (score >= C)
            result = "미";
        else if (score >= D)
            result = "양";
        else
            result = "가";
        return (result);
    }

    @Override
    public String partList() {
        String result = "";
        for (int i = 0; i < parts.size(); i++)
            result += String.format(" %3d(%s) ", parts.get(i).getScore(),
                    grade(parts.get(i).getScore()));
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %3d %7.2f(%s)", super.toString(),
                sum(), average(), grade(average()));
    }
}
public class University extends Student implements Project {
    public University(String studentID, String name) {
        super(studentID, name);
        parts.add(0, new Part("출석"));
        parts.add(new Part("레포트"));
    }

    private double partScore(int score, int rate) {
        return score * (rate / 100.0);
    }

    @Override
    public double average() {
        double sum = 0.0;
        for (int i = 0; i < parts.size(); i++)
            if (i == 0)
                sum += partScore(parts.get(i).getScore(), 100);
            else if (i == parts.size() - 1)
                sum += partScore(parts.get(i).getScore(), 20);
            else
                sum += partScore(parts.get(i).getScore(), 30);
        return sum;
    }

    @Override
    public String grade(double score) {
        String grade = "";
        if (score >= A)
            grade = "A";
        else if (score >= B)
            grade = "B";
        else if (score >= C)
            grade = "C";
        else if (score >= D)
            grade = "D";
        else
            grade = " F";
        if (!grade.equals(" F")) {
            if (score % 10 - 5 >= 0)
                grade += "+";
            else
                grade += "0";
        }
        return grade;
    }

    @Override
    public String partList() {
        String result = "";
        for (int i = 0; i < parts.size(); i++) {
            if (i == 0)
                result += String.format(" %3d(%4.1f)", parts.get(i).getScore(),
                        partScore(parts.get(i).getScore(), 100));
            else if (i == parts.size() - 1)
                result += String.format(" %3d(%4.1f)", parts.get(i).getScore(),
                        partScore(parts.get(i).getScore(), 20));
            else
                result += String.format(" %3d(%4.1f)", parts.get(i).getScore(),
                        partScore(parts.get(i).getScore(), 30));
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %5.1f(%s)",
                super.toString(), average(), grade(average()));
    }
}

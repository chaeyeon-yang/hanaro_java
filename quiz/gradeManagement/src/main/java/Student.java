public class Student {
    private String name;
    private int langScore;
    private int engScore;
    private int mathScore;

    public Student(String name, int langScore, int engScore, int mathScore) {
        this.name = name;
        this.langScore = langScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getLangScore() {
        return langScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public int getMathScore() {
        return mathScore;
    }
    public int getTotalScore() {
        return langScore+engScore+mathScore;
    }

    public double getAvgScore() {
        return Math.round(getTotalScore()/3);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLangScore(int langScore) {
        this.langScore = langScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        String studentInfo ="이름: "+getName()+" 국어: "+getLangScore()+" 영어: "+getEngScore()+" 수학: "+getMathScore()+" 총점: "+getTotalScore()+" 평균: "+getAvgScore();
        return studentInfo;
    }
}

package stream;

public class MyStudent{
    private String name;
    private boolean gender;
    private int hak;
    private int ban;
    private int score;

    enum Level{HIGH, MID,LOW}// 성적 상, 중, 하
    public MyStudent(){

    }

    public MyStudent(String name, boolean gender, int hak, int ban, int score) {
        this.name = name;
        this.gender = gender;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, gender ? "남" : "여",hak, ban, score);
    }

    public int compareTo(MyStudent myStudent){
        return Integer.compare(this.score, myStudent.getScore());
    }
}

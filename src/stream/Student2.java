package stream;

public class Student2{
    private String name;//이름
    boolean isMale;//성별
    int hak;//학년
    private int ban;
    private int score;
    
    enum Level{ HIGH, MID, LOW }//성적을 상 중 하로 구분
    public Student2(){

    }

    public Student2(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s, %d학년, %d반, %d3점]", name, isMale ? "남":"여", hak, ban, score);
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }
}

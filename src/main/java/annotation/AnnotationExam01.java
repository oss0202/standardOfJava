package annotation;

public class AnnotationExam01 {
    @InsertIntData(data = 30)
    private int myAge;

    @InsertIntData
    private int defaultAge;

    public AnnotationExam01() {
        this.myAge = -1;
        this.defaultAge = -1;
    }

    public int getMyAge() {
        return myAge;
    }

    public int getDefaultAge() {
        return defaultAge;
    }

    public static void main(String[] args) {
        AnnotationExam01 exam01 = new AnnotationExam01();
        System.out.println(exam01.getMyAge());
    }
}

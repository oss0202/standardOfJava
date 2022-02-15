package annotation;

public class UseAnnotationExam {
    public static void main(String[] args) {
        AnnotationHandler handler = new AnnotationHandler();
        AnnotationExam01 exam01 = handler.getInstance(AnnotationExam01.class, InsertIntData.class)
                .map(o -> (AnnotationExam01)o)
                .orElse(new AnnotationExam01());


        System.out.println("myAge = " + exam01.getMyAge());
        System.out.println("defaultAge = " + exam01.getDefaultAge());
    }
}

package annotation;
@TestInfo(
        count = 3
        ,testedBy = "Oh"
        ,testTools = {"JUnit"}
        ,testType = TestType.FIRST
        ,testDate = @DateTime(yymmdd = "210202", hhmmss = "235959")
)
public class UseAnnotation {

}

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tutorial.Bicycle;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

@IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.ReplaceUnderscores.class)
public class UseBicycleTest {
    @Test
    void 바이클_사용(){
        Bicycle bicycle = new Bicycle(1,1,1);
        assertEquals(1, bicycle.getID(), "tutorial.Bicycle getId");
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "3, 4, 5"})
    void 파라미터_바이클_사용(int startCadence, int startSpeed, int startGear){
        System.out.println("startCadence : " + startCadence + ", startSpeed : " + startSpeed + ", startGear : " + startGear);
//        tutorial.Bicycle bicycle = new tutorial.Bicycle(1,1,1);
//        assertEquals(1, bicycle.getID(), "tutorial.Bicycle getId");
    }

    @RepeatedTest(10)
    void 반복_바이클_사용(RepetitionInfo repetitionInfo){
        System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition());
    }
    // This will result in a JUnitException!
    @TestFactory
    Collection<DynamicTest> dynamicTestsWithInvalidReturnType() {
        return Arrays.asList(
                dynamicTest("1st dynamic test", ()-> System.out.println("1st")),
                dynamicTest("2st dynamic test", ()-> System.out.println("2st"))
        );
    }

    @BeforeEach
    void beforeEachTest(){
        System.out.println("beforeEachTest");
    }
}

package racingcar;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class OutputViewTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    public static void main(String[] args) {
        //given
        Cars cars = new Cars(Arrays.asList(new Car("pobi"), new Car("woni")));
        //when
        OutputView.printResult(cars, 2);
        //then
    }

    @Test
    void printResult_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    main(new String[]{});
                    assertThat(output()).contains("실행 결과", "pobi : -", "woni : ", "pobi : --", "woni : -"); // output() 메서드의 trim() 적용됨을 유의
                },
                MOVING_FORWARD, STOP, MOVING_FORWARD, MOVING_FORWARD
        );
    }

    @Test
    void printWinner() {
        //given
        //when
        OutputView.printWinner(Arrays.asList(new Car("pobi"), new Car("jun")));
        //then
        assertThat(output()).contains("최종 우승자 : pobi, jun");
    }

    @Override
    public void runMain() {
        main(new String[]{});
    }
}
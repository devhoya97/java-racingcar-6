package racingcar;

import java.util.Collections;
import java.util.List;

public class Referee {

    public static List<Car> findWinners(CarGroup carGroup) {
        int maxMoveCount = findMaxMoveCount(carGroup);

        return carGroup.findCarsByMoveCount(maxMoveCount);
    }

    private static int findMaxMoveCount(CarGroup carGroup) {
        List<Integer> moveCounts = carGroup.getMoveCounts();

        return Collections.max(moveCounts);
    }
}

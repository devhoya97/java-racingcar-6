package racingcar.view;

import java.util.List;
import racingcar.Car;

public class OutputView {
    private static final String NAME_AND_MOVE_DELIMITER = " : ";
    private static final String MOVE_EXPRESSION = "-";
    private static final String NEW_LINE = "\n";



    public static void printProgress(List<Car> cars) {
        StringBuilder message = new StringBuilder();

        for (Car car : cars) {
            message.append(car.getName()).append(NAME_AND_MOVE_DELIMITER);

            for (int count = 0; count < car.getMoveCount(); count++) {
                message.append(MOVE_EXPRESSION);
            }

            message.append(NEW_LINE);
        }

        System.out.println(message);
    }
}

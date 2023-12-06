package racingcar.view;

import java.util.List;
import java.util.StringJoiner;
import racingcar.Car;

public class OutputView {
    private static final String PRINTING_DELIMITER = " : ";
    private static final String MOVE_EXPRESSION = "-";
    private static final String NEW_LINE = "\n";
    private static final String WINNER_DELIMITER = ", ";


    public static void printMessageBeforeProgress() {
        System.out.println(NEW_LINE + "실행 결과");
    }

    public static void printProgress(List<Car> cars) {
        StringBuilder message = new StringBuilder();

        for (Car car : cars) {
            message.append(car.getName()).append(PRINTING_DELIMITER);

            for (int count = 0; count < car.getMoveCount(); count++) {
                message.append(MOVE_EXPRESSION);
            }

            message.append(NEW_LINE);
        }

        System.out.println(message);
    }

    public static void printWinner(List<Car> winners) {
        List<String> winnerNames = winners.stream()
                .map(Car::getName)
                .toList();

        String combinedWinnerNames = String.join(WINNER_DELIMITER, winnerNames);

        System.out.println("최종 우승자" + PRINTING_DELIMITER + combinedWinnerNames);
    }

}

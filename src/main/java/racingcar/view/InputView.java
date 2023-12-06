package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final String DELIMITER = ",";

    public static List<String> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String[] splitInput = Console.readLine().split(DELIMITER);
        List<String> carNames = new ArrayList<>();

        for (String input : splitInput) {
            carNames.add(input.trim());
        }

        validateEmpty(carNames);

        return carNames;
    }

    private static void validateEmpty(List<String> carNames) {
        for (String carName : carNames) {
            if (carName.isEmpty()) {
                throw new IllegalArgumentException();
            }
        }
    }

    public static int getTryCount() {
        return 0;
    }

    private static Integer customParseInt(String input) {
        return 0;
    }
}

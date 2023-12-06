package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        CarGroup carGroup = new CarGroup(InputView.getCarNames());
        int tryCount = InputView.getTryCount();

        OutputView.printMessageBeforeProgress();
        play(carGroup, tryCount, new RandomNumberGenerator());

        OutputView.printWinner(Referee.findWinners(carGroup));
    }

    private static void play(CarGroup carGroup, int tryCount, RandomNumberGenerator randomNumberGenerator) {
        for (int count = 0; count < tryCount; count++) {
            carGroup.move(randomNumberGenerator);

            OutputView.printProgress(carGroup.getCars());
        }
    }
}

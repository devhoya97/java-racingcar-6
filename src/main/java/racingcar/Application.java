package racingcar;

import java.util.List;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        CarGroup carGroup = new CarGroup(List.of("pobi", "jun"));
        carGroup.move(new RandomNumberGenerator());
        OutputView.printProgress(carGroup.getCars());

        carGroup.move(new RandomNumberGenerator());
        OutputView.printProgress(carGroup.getCars());

        carGroup.move(new RandomNumberGenerator());
        OutputView.printProgress(carGroup.getCars());

        OutputView.printWinner(Referee.findWinners(carGroup));
    }
}

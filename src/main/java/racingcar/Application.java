package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        CarGroup carGroup = new CarGroup(List.of("pobi", "jun"));
        carGroup.move(new RandomNumberGenerator());
        carGroup.move(new RandomNumberGenerator());
        carGroup.move(new RandomNumberGenerator());

        List<Car> winners = Referee.findWinners(carGroup);
        winners.stream()
                .map(Car::getName)
                .forEach(System.out::println);

        winners.stream()
                .map(Car::getMoveCount)
                .forEach(System.out::println);
    }
}

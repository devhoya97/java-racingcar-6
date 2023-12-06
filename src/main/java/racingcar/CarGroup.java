package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarGroup {

    private final List<Car> cars;

    public CarGroup(List<String> carNames) {
        cars = carNames.stream()
                .map(Car::new)
                .toList();
    }

    public void move(RandomNumberGenerator randomNumberGenerator) {
        for (Car car : cars) {
            int randomNumber = randomNumberGenerator.create();

            car.move(randomNumber);
        }
    }

    public List<Integer> getMoveCounts() {
        List<Integer> moveCounts = new ArrayList<>();

        for (Car car : cars) {
            int moveCount = car.getMoveCount();

            moveCounts.add(moveCount);
        }

        return moveCounts;
    }

    public List<Car> findCarsByMoveCount(int moveCount) {
        List<Car> thisMoveCountCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.isEqualMoveCount(moveCount)) {
                thisMoveCountCars.add(car);
            }
        }

        return thisMoveCountCars;
    }
}

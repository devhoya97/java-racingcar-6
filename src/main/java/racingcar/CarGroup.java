package racingcar;

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
        return null;
    }

    public List<Car> findCarsByMoveCount(int moveCount) {
        return null;
    }
}

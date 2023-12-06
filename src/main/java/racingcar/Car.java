package racingcar;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_NUMBER_FOR_MOVE = 4;
    private static final int DEFAULT_MOVE_COUNT = 0;
    private final String name;
    private int moveCount;

    public Car(String name) {
        validateName(name);
        this.name = name;
        moveCount = DEFAULT_MOVE_COUNT;
    }

    private void validateName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public void move(int number) {
        if (number >= MIN_NUMBER_FOR_MOVE) {
            moveCount++;
        }
    }

    public boolean isEqualMoveCount(int moveCount) {
        return false;
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return 0;
    }

}

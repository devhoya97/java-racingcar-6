package racingcar;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private final String name;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public void move(int number) {

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

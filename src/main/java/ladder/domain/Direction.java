package ladder.domain;

public class Direction {
    private final boolean left;
    private final boolean right;

    public Direction(boolean left, boolean right) {
        this.left = left;
        this.right = right;
    }

    public boolean moveLeft() {
        return this.left;
    }

    public boolean moveRight() {
        return this.right;
    }
}

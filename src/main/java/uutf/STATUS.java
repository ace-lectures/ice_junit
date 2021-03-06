package uutf;

public enum STATUS {

    PASSED(' '),
    FAILED('X'),
    ERRORED('!');

    private char symbol;

    STATUS(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "["+symbol+"]";
    }
}

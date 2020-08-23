package ladder;

public enum LineType {

    TRUE ("-----|"),
    FALSE("     |");

    private final String line;

    LineType(String line) {
        this.line = line;
    }

    public static LineType of(boolean lineType) {
        if (lineType) {
            return LineType.TRUE;
        }
        return LineType.FALSE;
    }

    public String printLine() {
        return line;
    }
}

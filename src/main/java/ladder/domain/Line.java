package ladder.domain;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Line {
    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public int move(AtomicInteger positionIndex) {
        return move(positionIndex.get());
    }
    
    public int move(int positionIndex) {
        return points.get(positionIndex).move();
    }

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Line{" +
                "points=" + points +
                '}';
    }
}

package ladder.domain;

public class LineGeneratorFactory {
    public Line generate(int width) {
        return lineGenerator().generate(width);
    }
    
    private LineGenerator lineGenerator() {
        PointGenerator pointGenerator = new BasicPointGenerator();
        return new BasicLineGenerator(pointGenerator);
    }
}

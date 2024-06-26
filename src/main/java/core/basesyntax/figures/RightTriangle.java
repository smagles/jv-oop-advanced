package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq. units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: " + getColor());
    }
}

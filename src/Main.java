public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape oval = new Oval();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();

        ShapePrinter shapePrinter = new ShapePrinter();

        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(quad);
        shapePrinter.printShapeName(oval);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(hexagon);
    }
}

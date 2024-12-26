public class Figure {
    public static void main(String[] args) {
        try {
            // Прямоугольник
            Rectangle rectangle = new Rectangle(5, 3);
            System.out.println("Площадь прямоугольника: " + rectangle.getArea());
            System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

            // Круг
            Circle circle = new Circle(4);
            System.out.println("Площадь круга: " + circle.getArea());
            System.out.println("Длина окружности: " + circle.getCircumference());

            // Треугольник
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Площадь треугольника: " + triangle.getArea());
            System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}

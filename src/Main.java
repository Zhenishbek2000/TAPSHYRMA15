public class Main {
    public static void main(String[] args) {
        System.out.println("Objects Methods");
        Circle circle = new Circle(5);
        circle.area();
        circle.circumference();
        double circleArea= Circle.area(15);
        double curcleCircumference=Circle.cercumference(13);
        System.out.println("Static Methods");
        System.out.println(circleArea);
        System.out.println(curcleCircumference);
    }
}
package ex4.exercise;

public class ColoredCircleTest {
  public static void main(String[] args) {
    Circle c = new Circle(10);
    c.show();

    ColoredCircle c1 = new ColoredCircle(20,"빨간색");
    System.out.println(c1);
  }
}

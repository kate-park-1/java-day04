package ex4;

import java.util.Objects;

public class BallArrayDemo {
  public static void main(String[] args) {
    Ball[] balls = new Ball[5];

    for (int i = 0; i < 2 ; i++) {
      balls[i] = new Ball(i+5);
    }

    for (Ball ball : balls) {
      if(ball != null){// ball == null
        System.out.println(ball.getRadius());
      }
      if(Objects.nonNull(ball)){
        System.out.println(ball.getVolume());
      }
    }
  }
}

class Ball {
  private double radius;

  public Ball(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getVolume() {
    return Math.PI * radius * radius * radius * 4/3 ;
  }
}
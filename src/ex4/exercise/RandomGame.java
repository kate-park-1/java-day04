package ex4.exercise;

import java.util.Arrays;

public class RandomGame {
  public static void main(String[] args) {
    String[] name = {"가위","바위","보"};
    int tmp;
    System.out.println(name);
    System.out.println(Arrays.toString(name));

    for(int i = 0; i < 30; i++) {
      //System.out.println(Math.random());
      //System.out.println(Math.random() * 2);
      //System.out.println((int)Math.random()*3);
      tmp = (int)(Math.random()*3);
      System.out.println(name[tmp]);
    }
  }
}

package day5;

import java.util.Scanner;

public class HomeworkEleven {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double mass;
    double speed;

    System.out.print("Please input the mass followed by the speed of the object: ");

    mass = in.nextDouble();
    speed = in.nextDouble();

    double kineticEnergy = 0.5 * mass * speed * speed;

    System.out.println("The kinetic energy of the object is: " + kineticEnergy);

    in.close();


 }   
}

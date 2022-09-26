package day5;

public class HomeworkFour {
    public static void main(String[] args) {
        int minutes = 525600;
        int seconds = minutes * 60;
        double speedOfLight = 300000000;
        double distance = seconds * speedOfLight;
        System.out.println("The distance light can travel in one year is: " + distance + "m/s");
    }
}

package day5;

public class HomeworkFive {
    public static void main(String[] args) {
        int wins = 110;
        int loses = 44;
        int total = wins + loses;
        double winPercent = ((double)Math.round((double)wins / total * 100000)) / 1000;
        System.out.println("The team's win percent is: " + winPercent);
    }
}

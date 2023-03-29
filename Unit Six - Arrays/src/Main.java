import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int C = Integer.parseInt(in.nextLine());
        String A = in.nextLine();
        String B = in.nextLine();
        int numWet = 0;
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < C; j++){
                if (A.substring(j,j+1).equals("1")){
                    numWet++;
                }
                if (B.substring(j,j+1).equals("1")){
                    numWet++;
                }
                if (A.substring(j,j+1).equals(B.substring(j,j+1)) && A.substring(j,j+1).equals("1") && j % 2 == 1){
                    numWet -= 2;
                }
            }
            for (int j = 1; j < C; j++) {
                if (A.substring(j-1,j).equals(A.substring(j,j+1)) && A.substring(j,j+1).equals("1")){
                    numWet -= 2;
                }
                if (B.substring(j-1,j).equals(B.substring(j,j+1)) && B.substring(j,j+1).equals("1")){
                    numWet -= 2;
                }
            }
        }
        System.out.println(numWet);*/
    }
}

        /*int F = 0;
        int P = in.nextInt();
        int C = in.nextInt();
        for (int i = 0; i < P; i++) {
            F += 50;
        }
        for (int i = 0; i < C; i++) {
            F -= 10;
        }
        if (P > C){
            F += 500;
        }
        System.out.println(F);*/

        /* int N = in.nextInt();
        int T = 0;
        for (int i = 0; i <= N; i++){
            String pepper = in.nextLine();
            if (pepper.equals("Poblano"))
                T += 1500;
            else if (pepper.equals("Mirasol"))
                T += 6000;
            else if (pepper.equals("Serrano"))
                T += 15500;
            else if (pepper.equals("Cayenne"))
                T += 40000;
            else if (pepper.equals("Thai"))
                T += 75000;
            else if (pepper.equals("Habanero"))
                T += 125000;
        }
        System.out.println(T); */

        /*int N = Integer.parseInt(in.nextLine());
        int day1 = 0;
        int day2 = 0;
        int day3 = 0;
        int day4 = 0;
        int day5 = 0;
        String bestDay = "0";
        for (int i = 0; i < N; i++){
            String A = in.nextLine();
            if (A.substring(0,1).equals("Y"))
                day1++;
            else if(A.substring(1,2).equals("Y"))
                day2++;
            else if(A.substring(2,3).equals("Y"))
                day3++;
            else if(A.substring(3,4).equals("Y"))
                day4++;
            else if(A.substring(4,5).equals("Y"))
                day5++;
        }
        if (day1 > day2 && day1 > day3 && day1 > day4 && day1 > day5)
            bestDay = "1";
        else if (day2 > day1 && day2 > day3 && day2 > day4 && day2 > day5)
            bestDay = "2";
        else if (day3 > day1 && day3 > day2 && day3 > day4 && day3 > day5)
            bestDay = "3";
        else if (day4 > day1 && day4 > day2 && day4 > day3 && day4 > day5)
            bestDay = "4";
        else if (day5 > day1 && day5 > day2 && day5 > day3 && day5 > day4)
            bestDay = "5";
        else if (day1 == day2 && day1 > day3 && day1 > day4 && day1 > day5)
            bestDay = "1,2";
        else if (day1 > day2 && day1 == day3 && day1 > day4 && day1 > day5)
            bestDay = "1,3";
        else if (day1 > day2 && day1 > day3 && day1 == day4 && day1 > day5)
            bestDay = "1,4";
        else if (day1 > day2 && day1 > day3 && day1 > day4 && day1 == day5)
            bestDay = "1,5";
        else if (day2 > day1 && day2 == day3 && day2 > day4 && day2 > day5)
            bestDay = "2,3";
        else if (day2 > day1 && day2 > day3 && day2 == day4 && day2 > day5)
            bestDay = "2,4";
        else if (day2 > day1 && day2 > day3 && day2 > day4 && day2 == day5)
            bestDay = "2,5";
        else if (day3 > day1 && day3 > day2 && day3 == day4 && day3 > day5)
            bestDay = "3,4";
        else if (day3 > day1 && day3 > day2 && day3 > day4 && day3 == day5)
            bestDay = "3,5";
        else if (day4 > day1 && day4 > day2 && day4 > day3 && day4 == day5)
            bestDay = "4,5";
        System.out.println(bestDay);*/
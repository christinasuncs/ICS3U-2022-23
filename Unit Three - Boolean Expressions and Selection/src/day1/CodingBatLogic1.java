package day1;

public class CodingBatLogic1 {
    public boolean love6(int a, int b) {
      if(a == 6 || b == 6){
        return true;
      } 
      if (a + b == 6){
        return true;
      } 
      if (Math.abs(a - b) == 6){
        return true;
      }
      return false;
    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
      if (isWeekend && cigars >= 40){
        isWeekend = true;
      }
      else if (cigars >= 40 && cigars <= 60){
        isWeekend = true;
      }
      else{
        isWeekend = false;
      }
      return isWeekend;
    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
      int result = 0;
      if(isBirthday){
        speed -= 5;
      }
      if(speed <= 60){
        result = 0;
      } else if(speed <= 80 && speed >= 61){
        result = 1;
      } else if(speed >= 81){
        result = 2;
      }
      return result;
    }
    public boolean squirrelPlay(int temp, boolean isSummer) {
      boolean isPlaying = false;
      if(isSummer == true){
        if(temp >= 60 && temp <= 100){
          isPlaying = true;
        }
      }
      if(isSummer == false){
        if(temp >= 60 && temp <= 90){
          isPlaying = true;
        }
      }
      return isPlaying;
    }
    public int dateFashion(int you, int date) {
      int result;
      if(you <= 2 || date <= 2){
        result = 0;
      } else if (you >= 8 || date >= 8){
        result = 2;
      }
      else {
        result = 1;
      }
      return result;
    }
    public int sortaSum(int a, int b) {
      int sum = a + b;
      if(sum >= 10 && sum <= 19){
        sum = 20;
      }
      return sum;
    }
    public String alarmClock(int day, boolean vacation) {
      String time = "7:00";
      if(!vacation){
        if(day >= 1 && day <= 5){
          time = "7:00";
      } else if (day == 6 || day == 0){
        time = "10:00";
      }
      } else if (vacation){
          if(day >= 1 && day <= 5){
          time = "10:00";
        } else if (day == 6 || day == 0){
          time = "off";
        } 
      }
      return time;
    }
    public boolean in1To10(int n, boolean outsideMode) {
      boolean result = false;
      if(!outsideMode){
        if(n >= 1 && n <=10){
          result = true;
        }
      } else if(outsideMode){
        if(n <= 1 || n >= 10){
          result = true;
        }
      }
      return result;
    }
    public boolean specialEleven(int n) {
      if(n % 11 == 0 || n % 11 == 1){
        return true;
      }
      return false;
    }
    public boolean more20(int n) {
      if(n % 20 == 1 || n % 20 == 2){
        return true;
      }
      return false;
    }
    public boolean old35(int n) {
      if(n % 3 == 0 && n % 5 == 0){
        return false;
      } else if (n % 3 == 0){
        return true;
      } else if (n % 5 == 0){
        return true;
      }
      return false;
    }
    public boolean less20(int n) {
      if(n % 20 == 18 || n % 20 == 19){
        return true;
      }
      return false;
    }
    public boolean nearTen(int num) {
      if(num % 10 <= 2 || num % 10 >= 8){
        return true;
      }
      return false;
    }
    public int teenSum(int a, int b) {
      int sum = a + b;
      if(a >= 13 && a <= 19){
        sum = 19;
      } else if(b >= 13 && b <= 19){
        sum = 19;
      }
      return sum;
    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
      boolean answerCell = true;
      if(isAsleep){
        answerCell = false;
      }else if(isMom){
        answerCell = true;
      }else if(isMorning){
        answerCell = false;
      }
      return answerCell;
    }
    public int teaParty(int tea, int candy) {
      int outcome = 0;
      if(tea < 5 || candy < 5){
        outcome = 0;
      } else if(tea >= 2*candy || candy >= 2*tea){
        outcome = 2;
      } else if(tea >= 5 && candy >= 5){
        outcome = 1;
      }
      return outcome;
    }
    public String fizzString(String str) {
      if(str.substring(0,1).equals("f") && str.substring(str.length()-1).equals("b")){
        return "FizzBuzz";
      }else if(str.substring(0,1).equals("f")){
        return "Fizz";
      }else if(str.substring(str.length()-1).equals("b")){
        return "Buzz";
      } 
      return str;
    }
    public String fizzString2(int n) {
      if(n % 3 == 0 && n % 5 == 0){
        return "FizzBuzz!";
      }else if (n % 3 == 0){
        return "Fizz!";
      }else if(n % 5 == 0){
        return "Buzz!";
      }else{
        return n + "!";
      }
    }
    public boolean twoAsOne(int a, int b, int c) {
      if(a + b == c || b + c == a || a + c == b){
        return true;
      }
      return false;
    }
    public boolean inOrder(int a, int b, int c, boolean bOk) {
      if(bOk){
        if(c > b){
          return true;
        }
      }else if(b > a && c > b){
        return true;
      }
      return false;
    }
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
      if(equalOk && a <= b && b <= c){
        return true;
      }else if(a < b && b < c){
        return true;
      }
      return false;
    }
    public boolean lastDigit(int a, int b, int c) {
      if(a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10){
        return true;
      }
      return false;
    }
    public boolean lessBy10(int a, int b, int c) {
      if(Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10 ){
        return true;
      }
      return false;
    }
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
      if(noDoubles && die1 == die2){
        die1++;
      }
      if(die1 == 7){
        die1 = 1;
      }
      int sum = die1 + die2;
      return sum;
    }
    public int maxMod5(int a, int b) {
      if(a == b){
        return 0;
      }else if(a % 5 == b % 5){
        if(a < b){
          return a;
        } else if (b < a) {
          return b;
        }
      }else if(a > b){
        return a;
      }
      return b;
    }
    public int redTicket(int a, int b, int c) {
      int result = 0;
        if(a == b && b == c && c == 2){
          result = 10;
      }else if(a == b && b == c){
        result = 5;
      } else if(a != b && a != c){
        result = 1;
      }
      return result;
    }
    public int greenTicket(int a, int b, int c) {
      int result = 0;
      if(a != b && b != c && a != c){
        result = 0;
      }else if(a == b && b == c){
        result = 20;
      }else if(a == b || b == c || a == c){
        result = 10;
      }
      return result;
    }
    public int blueTicket(int a, int b, int c) {
      int ab = a + b;
      int ac = a + c;
      int bc = b + c;
      int result = 0;
      if(ab == 10 || ac == 10 || ab == 10){
        result = 10;
      }else if(Math.abs(ab - ac) >= 10 || Math.abs(ab - bc) >= 10){
        result = 5;
      }
      return result;
    }
    public boolean shareDigit(int a, int b) {
      int digit1 = a / 10;
      int digit2 = a % 10;
      int digit3 = b / 10;
      int digit4 = b % 10;
      if(digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4){
        return true;
      }
      return false;
    }
    public int sumLimit(int a, int b) {
      int sum = a + b;
      String sumString = String.valueOf(sum);
      String aString = String.valueOf(a);
      if(sumString.length() == aString.length()){
        return sum;
      }else if(sumString.length() >= aString.length()){
        return a;
      }
      return b;
    }

}

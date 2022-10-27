package day2;

public class NestedIfStatements{
    public static void main(String[] args) {
        //nexted means inside something
        // nested if statement - an if statement inside an if statement

        boolean isRed = true;
        boolean isBig = true;
        int x = 7;
        int y = 8;

        if (x > 8){ 
            if(isRed)
                y++;
        } else { // 16 with 13, code with do else if big if is true
            y--;
        }

        if (x > 8 && isRed){ 
            y++;
        } else { // will run else if if is false
            y--;
        }

        // if (x > 8)
        //     if(isRed)
        //         y++;
        // else {
        //     y--;
        // }

        System.out.println(y); // y = 7

    }
}


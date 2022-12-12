package day3;

/**
 * NestedLoops
 */
public class NestedLoops {

    public static void main(String[] args) {
        //box(6,5);
        framingSquares(3,4,1,2);
    }
    
    private static void framingSquares(int m, int n, int p, int q) {
        // top frame
        for(int j = 0; j < q; j++){
            for(int i = 0; i < 2*q + 2*p + n; i++){
                System.out.print("#");
            }
            System.out.println();
        }

        // top matting
        for(int j = 0; j < p; j++){
            for(int i = 0; i < q; i++){
                System.out.print("#");
            }
            for(int i = 0; i < 2*p + n; i++){
                System.out.print("+");
            }
            for(int i = 0; i < q; i++){
                System.out.print("#");
            }
            System.out.println();
        }

        //picture
        for(int j = 0; j < m; j++){
            for(int i = 0; i < q; i++){
                System.out.print("#");
            }
            for(int i = 0; i < p; i++){
                System.out.print("+");
            }            
            for(int i = 0; i < n; i++){
                System.out.print(".");
            }
            for(int i = 0; i < p; i++){
                System.out.print("+");
            }  
            for(int i = 0; i < q; i++){
                System.out.print("#");
            }
            System.out.println();
        }

        // bottom matting
        for(int j = 0; j < p; j++){
            for(int i = 0; i < q; i++){
                System.out.print("#");
            }
            for(int i = 0; i < 2*p + n; i++){
                System.out.print("+");
            }
            for(int i = 0; i < q; i++){
                System.out.print("#");
            }
            System.out.println();
        }        

        // bottom frame
        for(int j = 0; j < q; j++){
            for(int i = 0; i < 2*q + 2*p + n; i++){
                System.out.print("#");
            }
            System.out.println();
        }
    }



    public static void box(int width, int height){
        // print height number of rows
        for(int h = 0; h < height; h++){
            // print 1 row
            // responsible for printing the columns in a row
            for (int c = 0; c < width; c++) {
                System.out.print("*");
            }
            System.out.println(); // prints enter
        }
    }
}
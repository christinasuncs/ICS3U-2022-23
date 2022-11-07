package day2;


public class ForLoopExamples {
   public static void main(String[] args) {
        //exampleOne();
        //exampleTwo(1, 1000);
        System.out.println(exampleThree("A B C D E"));



   }

   /* Introduction to for loops (counting loops) */
   private static void exampleOne() {
        /* for loop is eman to iterate through a collection when there are indexes - like strings. for loops is a counting loop*/
        // int i = 1;
        // int sum = 9;

        // while(i <= 10){
        //     sum += i;
        //     i++;
        // }
        int sum = 0;

        for(int i = 0; i <= 10; i++){
            sum += i;
        }

        System.out.println(sum);

        // 1. initialize int i = 0;
        // 2. checks conditions i <= 10 if condition is true, does body
        // 3. do the body of the for loop sum += i;
        // 4. increment i++
        // 5. check the conditions i <= 10
        // 6. do the body if its true
        // 7. increment i++;
        // 8. check the condition
        // only initialize once
   }

   /* Obtain the sum of the numbers from start to end */
   private static void exampleTwo(int start, int end) {
    int sum = 0;
    for(int i = start; i <= end; i++){
        sum += i;
    }
    System.out.println(sum);
   }

   /* return the number of words in the sentence */
   private static int exampleThree(String sentence) {
    int numSpaces = 0;

    if(sentence.length() == 0){
        return 0;
    }
    else if(sentence.length() < 3){
        return 1;
    }
    else{
        // loop
        for (int i = 0; i < sentence.length(); i++) {
            if(" ".equals(sentence.substring(i, i+1))){
                numSpaces++;
            }
        }
    }

    return numSpaces + 1;
   }


}
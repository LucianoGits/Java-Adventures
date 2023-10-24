public class Recursion {
    public static void main(String[] args){
        int result = recursiveFactorial(5 );
        int result2 = iterativeFactorial(5 );

        System.out.println("Recursive Factorial: " + result);
        System.out.println("Iterative Factorial (using for loops): " + result2);
    }

    private static int recursiveFactorial(int n) {
        // base case
        if(n == 0){
            return 1;
        }else{
            // recursive case
            return n* recursiveFactorial(n-1);
        }

    }
    private static int iterativeFactorial(int n){
        int factorial = 1;
        if(n == 0){
            return 1;
        }
        for(int i = 1; i <=n ; i++){
            factorial *= i;
        }

        return  factorial;
    }
}

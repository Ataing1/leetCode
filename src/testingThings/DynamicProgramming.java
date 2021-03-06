package testingThings;

public class DynamicProgramming {
    public static void main(String[] args) {
        DynamicProgramming dynamicProgramming = new DynamicProgramming();
        System.out.println(dynamicProgramming.Fibonacci(5));
    }

    public int Fibonacci(int n) { //memoized dynamic programming
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] memo = new int[n];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n-1] + memo[n-2];
    }

    public int fibonacci(int n){
        if (n == 0) return 0;
        int a = 0;
        int b = 1;

        for(int i = 2;i<n;i++){
           int  c = a+b;
            a = b;
            b = c;
        }
        return a + b;
    }


}

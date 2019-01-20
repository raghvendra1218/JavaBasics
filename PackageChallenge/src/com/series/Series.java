package com.series;

public class Series {
    public static int nSum(int n){
        int sum = 0;
        for(int i =0 ; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n){
        if(n == 0){
            return 0;
        } else {
            int fact = 1;
            for(int i = n; i>1; i--){
                fact *=i;
            }
            return fact;
        }
    }

    public static int fibonacci(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else{
            int result = 0;
            result = fibonacci(n-1)+ fibonacci(n-2);
            return result;
        }
    }
}

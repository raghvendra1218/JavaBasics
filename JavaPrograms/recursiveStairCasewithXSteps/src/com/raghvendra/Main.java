package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int X[] = {1,2};
        int possible_ways = possible_ways_DP(8, X);
        System.out.println(possible_ways);
    }

    //Recursive way
//    public static int possible_ways(int n, int X[]) {
//        if(n == 0) {
//            return 1;
//        } else {
//            int total = 0;
//            for (int i = 0; i<X.length; i++){
//                if(n - i >= 0){
//                    total += possible_ways()
//                }
//             return total;
//            }
//        }
//    }

    //Dynamic Programming way
    public static int possible_ways_DP(int n, int X[]) {
        if(n == 0) {
            return 1;
        } else {
            int data[] = new int[n + 1];
            data[0] = 1;
            int total;
            for(int i = 1; i <= n; i++) {
                total = 0;
                for(int j = 0; j < X.length; j++){
                    if(i - j >=0)
                        total += data[i-j];
                }
                data[i] = total;
            }
            return data[n];
        }
    }
}

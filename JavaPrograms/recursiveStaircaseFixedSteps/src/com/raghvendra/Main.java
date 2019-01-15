package com.raghvendra;

// Pattern identified : number of ways = n-1 + n-2

public class Main {
//    int data[];
    public static void main(String[] args) {
	// write your code here
        int possible_ways = num_ways(5);
        System.out.println(possible_ways);
        int possible_ways_bottom = num_ways_bottom_up(7);
        System.out.println(possible_ways_bottom);
    }

    //Recursive Implementation
    public static int num_ways(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return num_ways(n-1) + num_ways(n - 2);
        }

    }

    // Using Dynamic Programming because, above approach i.e. recursive way is costly

    public static int num_ways_bottom_up(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            int data[] = new int[n + 1];
            data[0] = 1;
            data[1] = 1;
            int i = 2;
            for(; i <= n ; i ++) {
                data[i] = data[i-1] + data[i -2];
            }
            return data[n];
        }
    }
}


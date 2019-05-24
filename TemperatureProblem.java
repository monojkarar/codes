package com.mac.java.test;

import java.util.Arrays;

public class TemperatureProblem {

	public static void main(String[] args) {
		
		int[] a = {-10, -10};
		int n = a.length;
		System.err.println(Arrays.toString(a));
        boolean duplicateFound = false;
        if(n > 0){
            int min = Math.abs(a[0]), tempMin = a[0], i=1;
            while(i<n){
                if(min == Math.abs(a[i])){
                    duplicateFound = true;
                }
                if(min > Math.abs(a[i])){
                    min = Math.abs(a[i]);
                    tempMin = a[i];
                }
                i++;
            }
            if(duplicateFound){
                System.out.println(Integer.toString(Math.abs(tempMin)));
            } else {
                System.out.println(Integer.toString(tempMin));
            }
        } else {
            System.out.println("0");
        }
	}

}

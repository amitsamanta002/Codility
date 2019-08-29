package Codility;

import java.util.Arrays;

public class NearestInt {

    private static int getVal(int[] arr){
        Arrays.sort(arr);
        int value = 1;
        for (int i : arr){
            if(i==value)
                value++;

        }
        return value;
    }

    public static void main(String[] args) {
        int[] arr = {10,8,2,3,1};
        System.out.println(getVal(arr));
    }
}

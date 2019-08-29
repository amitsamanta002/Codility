package Practise;

import java.util.Arrays;

public class OddOccurrencesInArray {

    private static int solution(int[] arr, int n){

        int result = 0;
        for(int i:arr)
            result = result^i;

        return result;
    }

    public static int solution1(int[] arr, int n){
        Arrays.sort(arr);

        int noFount = 00;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1])
                continue;
            else {
                noFount = arr[i];
                break;
            }
        }
        return noFount;

    }


    public static void main(String[] args) {

        int [] arr = {9,3,9,12,3,12,13,14,13,14,2};
        System.out.println("no found using solution-0 ="+solution(arr,arr.length));

        System.out.println("no found using solution-1 ="+solution1(arr,arr.length));

    }
}

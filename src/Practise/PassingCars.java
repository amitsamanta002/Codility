package Practise;

public class PassingCars {

    private static int passingcarcount(int [] arr){
        int counter = 0,multiplier=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0)
                counter = counter + multiplier;
            else
                multiplier++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1};
        System.out.println("passing cars count="+passingcarcount(arr));
    }

}

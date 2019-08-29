package Codility;

public class TapeEquilibrium {

    private static int getMindifferences(int[] arr){
        int sumleft = arr[0],sumright=0;

        for(int i=1;i<arr.length;i++)
            sumright +=arr[i];

        int diff = Math.abs(sumleft-sumright);

        for(int j=0;j<arr.length-1;j++){
            sumleft +=arr[j];
            sumright -= arr[j];

            if(Math.abs(sumleft-sumright)<diff)
                diff = Math.abs(sumleft-sumright);
        }
        return diff;
    }

    public static void main(String[] args) {
        int [] arr = {3,1,2,4,4,5};
        System.out.println("Minimum differences="+getMindifferences(arr));
    }
}

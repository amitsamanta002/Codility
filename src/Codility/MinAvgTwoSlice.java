package Codility;

public class MinAvgTwoSlice {

    private static double min(double x, double y){
        return x > y ? y : x;
    }

    private static int solution(int[] arr, int n){
        double minv = (arr[0]+arr[1])/2.0;
        int minp = 0;

        for(int i=0;i<n-2;i++){

            double tempminv = min((arr[i]+arr[i+1])/2.0,(arr[i]+arr[i+1]+arr[i+2])/3.0);
            if(tempminv<minv){
                minv = tempminv;
                minp=i;
            }
        }
        if((arr[n-2]+arr[n-1])/2.0 <minv){
            minv = arr[n-2]+arr[n-1]/2.0;
            minp = n-2;
        }
        return minp;
    }

    public static void main(String[] args) {
        int [] arr = {4,2,2,5,1,5,8};
        int minp = solution(arr,7);
        System.out.println("Minimum poi nter loc:"+minp);
    }
}

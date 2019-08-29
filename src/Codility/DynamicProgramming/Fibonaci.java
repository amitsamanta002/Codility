package Codility.DynamicProgramming;

public class Fibonaci {

    private static long[] fibo(long n){
        long [] arr = new long[(int)n];
        arr[0] = 0;
        arr[1] = 1;
        for(int j=2;j<n;j++){
            arr[j] = arr[j-1]+arr[j-2];
        }
        return arr;
    }

    private static long oldfibo(long num){
        if(num==0)
            return 0;
        if(num==1)
            return 1;
        long sum = oldfibo(num-1) + oldfibo(num-2);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Dynamic Program way - fibo of 100 :");
        long [] arr = fibo(100);
        for(long i : arr)
            System.out.print(i+"\t");
        System.out.println("Old Program way - fibo of 100 :"+oldfibo(100));

    }
}

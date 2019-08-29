package Codility.DynamicProgramming;

public class CoinChange {

    private static int getnoofWays(int coin[] ,int sum){

        int [][] store = new int[coin.length][sum+1];
        for(int k=0;k<coin.length;k++)
                store[k][0]=1;

        for(int i=0;i<coin.length;i++){
            for(int j=1;j<=sum;j++) {

                    if (coin[i] > j)
                        store[i][j] = store[i][j - 1];
                    else {
                        store[i][j] = store[i][j - 1] + store[i][j - coin[i]];
                    }
            }

        }
        return store[coin.length-1][sum];
    }

    public static void main(String[] args) {
        int [] coin = {1,2,3};
        System.out.print("No of ways:"+getnoofWays(coin,4));
    }
}

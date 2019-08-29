package Practise;

public class FrogJmp {

    private static int getJumpnumber(int x, int y, int h){
        return (int)Math.ceil((double)(y-x)/h);
    }
    public static void main(String[] args) {

        System.out.println("No of loops = "+getJumpnumber(10,85,30));

    }
}

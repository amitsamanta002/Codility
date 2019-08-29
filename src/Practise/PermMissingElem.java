package Practise;

public class PermMissingElem {

    private static int getMissingElement(int[] arr){
        int len = arr.length + 1;
        System.out.println("length="+len);
        int missing = (len*(len+1))/2;

        for(int i:arr)
            missing = missing - i;

        return missing;
    }

    public static void main(String[] args) {

        int [] arr = {1,4,2,3,9,8,6,5};

        System.out.print("Missing elements="+getMissingElement(arr));
    }
}

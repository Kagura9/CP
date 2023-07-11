package tests;

public class domino {
    public static void main(String[] args)  {
       int w = Integer.parseInt(args[0]) ;
        int m = Integer.parseInt(args[1]) ;
        int result;
        if((w*m)%2==0) {
            result = (w*m)/2;
        } else {
            result = (w*m-1)/2;
        }
        System.out.println(result);
    }
}

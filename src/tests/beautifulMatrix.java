package tests;

import static java.lang.Math.abs;

public class beautifulMatrix {
    public static void main(String[] args) {
        for(int o = 1; o < 25; o++) {
                    if (Integer.parseInt(args[o])> 0) {
                        int row = (int) Math.ceil(o/5);
                        int col = o % 5;
                        System.out.println(abs(row - 2) + abs(col - 2));
                    }
        }
    }
}


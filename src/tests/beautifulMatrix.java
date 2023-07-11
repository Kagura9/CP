package tests;

import static java.lang.Math.abs;

public class beautifulMatrix {
    public static void main(String[] args) {
        for(int o = 1; o < 25; o++) {
        int w = Integer.parseInt(args[o]);
            int result;
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < 5; k++) {
                    if (w > 0) {
                        result = abs(i - 3) + abs(k - 3);
                        System.out.println(result);
                    }
                }
            }
        }
    }
}


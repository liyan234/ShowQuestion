package day7;

import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int xyy = (B / 4) * 2 + Math.min(B % 4, 2);
            int xxxyyyy = ((B - 2) / 4) * 2 + Math.min((B-2) % 4, 2);

            int count = (B / 4) * (xxxyyyy + xyy) * 2;
            if (A % 4 == 1 ) {
                count = count + xyy;
            }
            if (A % 4 == 2) {
                count = count + (2 * xyy);
            }
            if (A % 4 == 3) {
                count = count + (2 * xyy) + xxxyyyy;
            }
            System.out.println(count);
        }
    }
}
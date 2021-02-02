package day33;

public class D1 {
    public int countWays(int n) {
        // write code here
        long[] x = {1,2,4};
        if (n <= 0) {
            return 0;
        }
        if(n == 1) {
            return (int)x[0];
        }
        if (n == 2) {
            return (int)x[1];
        }
        if (n == 3) {
            return (int)x[2];
        }
        for (int i = 4; i <= n; i++) {
            long tmp = (x[0] + x[1] + x[2]) % 1000000007;
            x[0] = x[1];
            x[1] = x[2];
            x[2] = tmp;
        }
        return (int)x[2];
    }
}

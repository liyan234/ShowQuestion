package day15;

public class one {
    public int addAB(int A, int B) {
        if (B==0) {
            return A;
        }
        if (A==0) {
            return B;
        }
        int sum = A ^ B; //相加但不进位
        int xx = (A & B) << 1; //进位但不相加
        return addAB(sum, xx);
    }
}

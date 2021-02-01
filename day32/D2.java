package day32;

public class D2 {
    public int countNumberOf2s(int n) {
        int count = 0;
        int x = 1;
        int low = 0; // 低位
        int cur = 0; // 当前位
        int high = 0; //高位

        while ( n/x != 0) {
            low =  n - (n / x) * x;
            cur = (n / x) % 10; //当前位
            high = n / (x * 10);

            switch(cur) {
                case 0:
                case 1:
                    count += high * x;
                    break;
                case 2:
                    count += high * x + low + 1;
                    break;
                default:
                    count += (high + 1) * x;
                    break;
            }
            x = x*10;
        }
        return count;
    }
}

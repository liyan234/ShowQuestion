package day46;

public class D1 {

    public int MoreThanHalfNum_Solution(int [] array) {
        int ret = array[0];
        int temp = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != ret) {
                temp--;

            } else {
                temp++;
            }
            if(temp == 0) {
                ret = array[i];
                temp = 1;
            }
        }
        temp = 0;
        for (int i = 0; i< array.length; i++) {
            if (array[i] == ret) {
                temp++;
            }
        }
        if (temp * 2 > array.length) {
            return ret;
        } else {
            return 0;
        }
    }
}

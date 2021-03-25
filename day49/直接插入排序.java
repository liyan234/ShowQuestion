package day49;


// 直接插入排序
public class 直接插入排序 {
    public void sort (int[] arr) {
        int len = arr.length;

        // 开辟有序空间
        for (int i = 1; i < len; i++) {
            //必须赋值一个x
            //用来防止在交换的时候改变了arr[i]的值
            int x = arr[i];
            int c = i-1;
            for (; c >= 0 ; c--) {
                // 递增
                if (x < arr[c]) {
                    arr[c + 1] = arr[c];
                }
            }
            //前面是有序的
            arr[c + 1] = x;
        }
    }
    private void swap(int[] arr, int j, int i) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}

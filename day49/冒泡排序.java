package day49;

// 冒泡排序
public class 冒泡排序 {

    public void sort(int[] arr) {
        int len = arr.length;
        // 冒泡排序
        // 也就是说
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j > i; j--) {
                if(arr[j] < arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private void swap(int[] arr, int j, int i) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}

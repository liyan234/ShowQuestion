package day49;

// 选择比较
public class 选择排序 {
    public void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // 找打最小的
            if (i != min) {
                swap(arr, i , min);
            }
        }
    }

    private void swap(int[] arr, int j, int i) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

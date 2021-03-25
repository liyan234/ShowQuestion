package day49;

//直接插入排序
public class 希尔排序 {

    public void sort(int[] arr) {
        int len = arr.length;
        int gap = len / 3;
        while (gap > 1) {
            helpSort(arr, gap);
            gap = gap /3;
        }
        helpSort(arr, 1);
    }

    private void helpSort(int[] arr, int gap) {
        // 直接插入排序的修改
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int c = i - gap;
            for (; c >= 0 && arr[c] > x; c -= gap) {
                arr[c + gap] = arr[c];
            }
            arr[c + gap] = x;
        }
    }

}

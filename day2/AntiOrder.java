package day2;

public class AntiOrder {

    public int count(int[] A, int n) {
        if (A == null || n == 0) {
            return 0;
        }
        return helpMerg(A, 0 , n-1);
    }

    private int helpMerg(int[] arr, int start, int end) {
        // 递归的结束条件
        if (end == start) {
            return 0;
        }
        // 拆分成两半
        int mid = (start + end)/ 2;

        // 这是一个递归
        return helpMerg(arr, start, mid) + helpMerg(arr, mid + 1, end)
                + merg(arr, start, mid, end);
    }

    private int merg(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1]; //合并数组
        int t =  0;  // 临时下标

        int a = start;
        int b = mid + 1;

        int sum = 0; //统计逆序数组对

        while (a <= mid && b <= end) {
               // 左边的大于右边的
            if (arr[a] <= arr[b]) {
                // 组织新建数组里的数
                temp[t] = arr[a];
                t ++;
                a ++;
            } else {
                // 左边的 大于 右边的
                // 计算 逆序对数就是 左边数组里的个数
                sum = sum + ( mid - a + 1 );
                // 这就是两个从mid中加的时候已经被合并了
                // 判断大小放入数组中就好了
                temp[t] = arr[b];
                t ++;
                b ++;
            }
        }

        // 因为新建数组里的数是经过排序的
        // 然后用新建数组里的数 替换老数组里的数
        // 但是temp数组中可能买没有装满数

        //一定是小于等于
        while (a <= mid) {
            temp[t] = arr[a];
            a ++;
            t ++;
        }

        while (b <= end) {
            temp[t] = arr[b];
            b ++;
            t ++;
        }

        // 然后我们更新数组
        // 一定是temp的长度 并且 arr的开始下标一定是 start
        for (int i = 0; i < temp.length; i++) {
            arr[start] = temp[i];
            start ++;
        }
        // 这就是我们上面所统计的sum了
        return sum;

    }


}

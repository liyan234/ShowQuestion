package day1;

public class two {

    public int findKth(int[] a, int n, int K) {
        //利用快排的话
        return helpFindKth(a, 0, n-1, K);
    }

    private int helpFindKth(int[] a, int start, int end, int k) {
        // pat 是返回的a[]的下标
        int pat = partation(a, start, end);
        if (k == pat - start + 1) {
            return a[pat];
        }
        // 因为找到的是pat 但是不符合 所以分开就可以了
        else if (k <= pat - start + 1) {
            // 小于的时候 不需要改变k的值  因为还是从start 开始  pat - 1结束
            return helpFindKth(a, start, pat - 1, k);
        } else {
            // 这个 就需要改变k的值  pat 是 下标 减去下标  加上n  再减去1
            // 要从 pat + 1开始 end 结束 
            return helpFindKth(a, pat + 1, end,k - pat + start - 1);
        }
        /*if (k > pat - start + 1) {
            // 这个 就需要改变k的值  pat 是 下标 减去下标  加上n  再减去1
            return helpFindKth(a, pat +1, end,k - pat + start - 1);
        }*/

    }

    private int partation(int[] a, int start, int end) {
        // 获得基准值
        int key = a[start];
        while (start < end) {
            // 如果 后边的小于基准值 end --
            while (start < end && a[end] <= key) {
                end--;
            }
            // 后边的不大于基准值了 然后交换
            if (start == end) {
                break;
            } else {
                a[start] = a[end];
            }
            // 如果前边的大于基准值 start++
            while (start < end && a[start] >= key) {
                start++;
            }
            // 然后前后交换
            if (start == end) {
                break;
            } else {
                a[end] = a[start];
            }
        }
        // 当这个交换完成之后
        a[start] = key;
        return start;
    }

}

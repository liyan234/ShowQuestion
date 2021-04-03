package 福图;

import java.util.Arrays;
import java.util.Comparator;

public class D2 {
    public String solve (int[] nums) {
        //
        if (nums.length == 0 || nums == null) {
            return null;
        }
        //
        StringBuffer sb = new StringBuffer();
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1 + o2;
                String str2 = o2 + o1;
                return str2.compareTo(str1);
            }
        });
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }
}

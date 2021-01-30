package day31;

import java.util.ArrayList;
import java.util.List;

public class D3 {
    List<List<Integer>> ret = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        dfs(0, nums);
        return ret;
    }

    public void dfs (int x ,int[] nums) {
        if (x == nums.length) {
            ret.add(new ArrayList<Integer>(list));
            return;
        }
        list.add(nums[x]);
        dfs(x + 1, nums);
        list.remove(list.size() - 1);
        dfs(x + 1, nums);

    }
}

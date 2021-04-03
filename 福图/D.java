package 福图;

import java.util.HashMap;
import java.util.Map;

public class D {
    public static int findtheNumber (int[] arr, int k) {
        if (arr.length == 0 || arr == null) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e: map.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,1,5,1,5};
        int num = findtheNumber(arr, 3);
        System.out.println(num);
    }
}

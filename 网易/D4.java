package 网易;

public class D4 {

    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,0,0,1,0,1,1};
        roomsAfterNDays(arr, 3);
    }


    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param rooms int整型一维数组 10个房间的起始状态
     * @param N     int整型 天数
     * @return int整型一维数组
     */
    public static int[] roomsAfterNDays(int[] rooms, int N) {
        for (int i = 0; i < N; i++) {
            helpRoom(rooms);
        }
        return rooms;
    }

    public static void helpRoom(int[] rooms) {
        int len = rooms.length;
        boolean[] bool = new boolean[len];
        for (int i = 0; i < len; i++) {
            if (rooms[i] == 0) {
                bool[i] = false;
            } else {
                bool[i] = true;
            }
        }
        if (rooms[0] == 1) {
            if (bool[1] == true) {
                rooms[0] = 0;
            }
        }
        if (rooms[len - 1] == 1) {
            if (bool[len - 2] == true) {
                rooms[len - 1] = 0;
            }
        }

        for (int i = 1; i < len - 1; i++) {
            if ((!bool[i - 1] && !bool[i + 1]) || (bool[i + 1] && bool[i - 1])) {
                rooms[i] = 1;
            } else {
                rooms[i] = 0;
            }
        }
    }
}


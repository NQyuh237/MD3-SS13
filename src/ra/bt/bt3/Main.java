package ra.bt.bt3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] arr = getArr();

        int target = 0;

        boolean result = searchInArray(arr, target);
        System.out.println("Số " + target + " có trong mảng: " + result);
    }

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static boolean searchInArray(int[][] arr, int target) {
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList();
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    rowList.add(i);
                    colList.add(j);
                    check = true;
                }
            }
        }

        if (check) {
            System.out.println("Số " + target + " được tìm thấy tại các vị trí:");
            for (int k = 0; k < rowList.size(); k++) {
                System.out.println("Dòng " + rowList.get(k) + ", Cột " + colList.get(k));
            }
        }

        return check;
    }
}

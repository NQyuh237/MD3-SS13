package ra.bt.bt4;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }

        scanner.close();
    }
}

package org.example;

import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1, 2, 10, 3, 4, 3, 5};
        int[] rong = new int[]{1,1,1};
        System.out.print("Mảng ban đầu: ");
        System.out.println(Arrays.toString(array));
        int k = nonDuplicateCount(array);
        System.out.println(k);
        int i = nonDuplicateCount(rong);
        System.out.println(i);
    }
    // Tìm trong mảng x bắt đầu từ start đến end có tồn tại k hay không
    public static boolean found(int[] x, int start, int end, int k) {
        for (int i = start; i <= end; i++) {
            if (x[i] == k) {
                return true;
            }
        }
        return false;
    }

    //Kiểm tra phần tử trùng nhau tính từ phần tử thứ 2
    public static int nonDuplicateCount(int[] a) {
        if (a.length == 0)
            return 0;
        int count = 1;
        // start check duplicate from the second element
        for (int i = 1; i < a.length; i++) {
            if (!found(a, 0, i - 1, a[i])) {
                count++;
            }
        }
        return count;
    }
}

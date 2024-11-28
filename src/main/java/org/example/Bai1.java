package org.example;

import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1, 2, 10, 3, 4, 3, 5};
        int[] rong = new int[]{1,1,1};
        System.out.print("Mảng ban đầu: ");
        System.out.println(Arrays.toString(array));
//        int[] xoaPT = remote(array);
//        System.out.println(Arrays.toString(xoaPT));
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



//    public static int[] remote(int[] array) {
//        int count = 0;
//        int index = 0;
//
//
//        //Đếm số lượng số nguyên bị trùng
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i]==array[j]){
//                    count++;
//                }
//            }
//        }
//        System.out.println("count: "+count);
//
//        //Gán số nguyên bị trùng đó vào 1 mảng mới
//        int[] trungNhau = new int[count];
//        int soTrung = 0;
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i]==array[j]){
//                    trungNhau[soTrung] = i;
//                    soTrung++;
//                }
//            }
//        }
//        System.out.println("Số nguyên bị trùng nhau ở vị trí: "+Arrays.toString(trungNhau));
//
//        //Tạo 1 mảng mới có kích thước bằng mảng cũ trừ đi mảng bị trùng
//        int[] newArray = new int[array.length-count];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i]==array[j]) {
//                    index++;
//                }
//            }
//        }
//        System.out.println("newArray: "+Arrays.toString(newArray));
//
//        //Gán các phần thử không trùng ở mảng cũ sang mảng mới
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if (array[i]==array[j]){
//                    newArray[i] = array[i];
//                }
//            }
//        }
//        return newArray;
//    }
}

package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong toi da cua mang: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Nhap tung phan tu cho mang: ");
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(digits));
        int[] result = congMot(digits);
        System.out.println(Arrays.toString(result));
    }
    //TODO 1: Tạo 1 hàm có phần tử cuối cộng 1
    // Duyệt từ cuối mảng, nếu chữ số nhỏ hơn 9, chỉ cần tăng lên 1
    // Nếu là 9, đặt thành 0 và tiếp tục carry
    // Nếu tất cả các chữ số đều là 9, tạo mảng mới
    // Đặt chữ số đầu tiên là 1
    public static int[] congMot(int[] digits){
        int n = digits.length;
        for (int i = n-1; i >= 0; i--) {
            if (digits[i] < 9 ){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newArray = new int[n + 1];
        newArray[0] = 1;
        return newArray;
    }
}

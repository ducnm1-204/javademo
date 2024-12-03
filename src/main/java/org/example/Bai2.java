package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhap vao so luong toi da cua mang: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int rd = random.nextInt(10);
            array[i] = rd;
        }
        System.out.println("Mang ban dau "+ Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Mang tang dan: "+Arrays.toString(array));
        System.out.println("Nhap vao so nguyen k: ");
        int TimK = find(array, sc.nextInt());
        System.out.println(TimK);
    }
    //Tìm trong mảng a vị trí đầu tiên của k
    public static int find(int[] a, int k) {
        int t = a.length;
        for (int i = 0; i < t ; i++) {
            if (k == a[i]){
                return i;
            }
        }
        return -1;
    }
}

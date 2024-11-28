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
//        timK(array);
        int k = find(array);
        System.out.println(k);
    }


//    public static void timK(int[] array) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao so nguyen k: ");
//        int k = sc.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            if (k == array[i]) {
//                System.out.println(i);
//            }
//        }
//    }
    //Tìm trong mảng a vị trí đầu tiên của k
    public static int find(int[] a) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen k: ");
        int k = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (k == a[i]){
                count++;
                System.out.println(i);
            }
        }
        int[] newArray = new int[a.length];


        return k;
    }
}

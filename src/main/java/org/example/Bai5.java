package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Nhập vào số lượng tối đa của mảng: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int random = rd.nextInt(10);
            nums[i] = random;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Nhập vào 1 số để tìm ra 2 số có tổng bằng số đó: ");
        int k = sc.nextInt();
        int[] sum = sumOf2Numbers(nums, k);
        System.out.println(Arrays.toString(sum));
    }

    public static int[] sumOf2Numbers(int[] nums, int k){
        int[] sum = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (k == nums[i] + nums[j]){
                    sum[0] = nums[i];
                    sum[1] = nums[j];
                }
            }
        }
        return sum;
    }
}

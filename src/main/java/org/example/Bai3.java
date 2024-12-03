package org.example;

public class Bai3 {
    public static void main(String[] args) {
        String inputString = "Computer programming or coding is the composition of sequences of instructions";
        System.out.println(inputString);
        int demTu = demTu(inputString);
        System.out.println("So từ trong chuỗi la: "+(demTu+1));
//        TODO 1: Cat khoang khong o 2 dau
//        TODO 2: Dem cac khoang cach (Dau cach giua cac tu)
//        TODO 3: Tu khoang cach + 1 la ra so tu
    }
    //Tạo 1 hàm đếm số từ trong chuỗi inputString
    public static int demTu(String inputString){
        char x;
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            x = inputString.charAt(i);
            if (x== ' '){
                count++;
            }
        }
        return count;
    }
}

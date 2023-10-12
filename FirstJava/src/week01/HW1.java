package week01;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        float floatNum = sc.nextFloat();
        String[] arr = new String[10];
        sc.nextLine();//개행문자 삭제
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("[ " + st + " ]");
        int intNum = (int) floatNum;
        System.out.println("별점 : " + intNum + " (" + (float) intNum / 5 * 100 + "%)");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + ". " + arr[i]);
        }
        System.out.println("\n");
    }
}

package week02.array;

import java.util.Arrays;

public class Arr01 {
    public static void main(String[] args) {
        int[] intArray = new int[3];//{0,0,0}초기값
        boolean[] boolArray = new boolean[3]; //{false,false,false}
        String[] stringArray = new String[3]; //{"","",""}


        int[] intArray2;
        intArray2 = new int[3];

        for(int i=0;i<intArray2.length;i++){
            System.out.println(intArray2[i]);
        }

        //배열의 주소를 모두 같은값으로 초기화
        Arrays.fill(intArray, 1);

    }
}

package week02.array;

import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {
        // 2. Arrays.copyOf() 메서드 깊은복사 메서드 2차원 배열도 깊은 복사가 됨
        // int[] b = a.clone(); //간단한 깊은 복사지만 2차원 배열이상에서는 얕은복사로 동작
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줍니다.

    }
}

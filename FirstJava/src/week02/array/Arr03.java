package week02.array;

public class Arr03 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = a; //얕은 복사

        b[0] = 3; //주소값만 복사 되었기에 a[]배열에도 영향감

        System.out.println(a[0]); // a[0] = 3;




    }
}

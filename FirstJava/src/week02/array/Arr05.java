package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        //기본형 변수 int vs 참조형 변수 String
        //기본형 변수는 소문자로 시작하고 값 자체를 저장함
        //참조형 변수는 대문자로 시작하고 별도에 공간에 값을 저장 후 그 주소를 저장함

        //char 보다는 String A.기능이 많기 때문에
        //Wrapper 클래스와 비슷 기본형 변수 기능이 제한 -> 다양한 기능 제공 Wrapper 클래스로 감싸서 추가기능 제공

    String str = "ABCD";

    int strLength = str.length();
        System.out.println(strLength);

        char strChar = str.charAt(1);
        System.out.println(strChar);

        //substring(int fromInx, int toInx)
        String strSub = str.substring(0,3);
        System.out.println(strSub); // = "ABC"

        //equals(String str)
        String newStr = "ABCE";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        //toCharArray() : String -> char[] (문자열 -> 문자 배열)
        char[] strCharArray = str.toCharArray();
        System.out.println(strCharArray);

        //char[] -> String (문자 배열 -> 문자열)
        char[] charArray = {'A','B','C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);


    }
}

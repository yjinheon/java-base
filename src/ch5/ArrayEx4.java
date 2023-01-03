package ch5;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // 배열 붙이기
        char[] result = new char[abc.length + num.length];

        // 배열 abc에서 result 로 result의 첫번째 위치부터 abc의 길이만큼 복사
        System.arraycopy(abc, 0, result, 0, abc.length);
        // 배열 num에서 result로 result의 abc 위치부터 num의 길이만큼 복사
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);
        // num의 6번째 위치부터 abc의 길이만큼 abc
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}

package ch5;

// 배열의 요소의 순서를 반복적으로 수정

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i=0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i < 100; i++) {
            int n = (int)(Math.random() * 10); // 0~9
            int tmp = numArr[0]; // 0번째 요소를 임시로 저장
            numArr[0] = numArr[n];
            numArr[n] = tmp; // 0번째 요소와 n번째 요소를 서로 바꾼다.
        } // end of for
        for (int i=0; i < numArr.length; i++)
            System.out.print(numArr[i]);
    }
}

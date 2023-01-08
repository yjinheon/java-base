package ch5;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i < numArr.length; i++) {
            counter[numArr[i]]++; // numArr[i]의 값에 해당하는 counter의 값을 1 증가
        }

        for (int i=0; i < numArr.length; i++) {
            System.out.println(i + "의 개수: " + counter[i]);
        }
    }
}

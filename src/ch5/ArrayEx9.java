package ch5;

// 배열에 저장된 값들 중 하나를 임의로 선택하여 저장

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};

        int[] arr = new int[10];

        for (int i=0; i < arr.length; i++) {
            int tmp = (int)(Math.random() * code.length); // 배열 code의 임의의 index
            arr[i] = code[tmp]; // 배열 code의 임의의 index에 저장된 값을 arr에 저장
        }

        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i] + ",");
            System.out.println(arr.length);
    }
}

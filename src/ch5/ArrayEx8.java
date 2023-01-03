package ch5;

// 로또 번호 생성

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i=0; i < ball.length; i++)
            ball[i] = i+1;

        int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
        int j = 0; // random index

        for (int i=0; i < 6; i++) {
            j = (int)(Math.random() * 45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (int i=0; i < 6; i++)
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
}

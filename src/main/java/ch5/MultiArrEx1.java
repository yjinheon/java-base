package ch5;

public class MultiArrEx1 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0f;

        for (int i=0; i<arr.length; i++) { // 4
            for (int j=0; j<arr[i].length; j++) { // 5
                total += arr[i][j];
            }
        }


        System.out.println("total = " + total);
        System.out.println("average = " + (float)total/(arr.length*arr[0].length));
        System.out.println("arr.length = " + arr.length);
    }
}

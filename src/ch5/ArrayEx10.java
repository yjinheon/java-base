package ch5;

// Bubble Sort

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i=0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i < numArr.length-1; i++) {
            boolean changed = false;

            for (int j=0; j< numArr.length-1-j; j++) {
                if (numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j] = temp;
                    changed = true;
                }
            } // end of for j
        }
    }
}

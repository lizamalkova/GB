import java.util.Arrays;

public class homework2 {

    public static void main(String[] args){

        changeNumbers();
        fillNumbers();
        compareNumbers();
        tableDi();
        minAndMax();

        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1 };
        System.out.println(checkBalance(arr));

        int[] arr1 = { 1, 2, 3 };
        moveArray(arr1, -1);
        System.out.println(Arrays.toString(arr1));
    }

    static void changeNumbers(){
        int[] nums = new int[10];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 0;
        nums[3] = 0;
        nums[4] = 1;
        nums[5] = 0;
        nums[6] = 1;
        nums[7] = 1;
        nums[8] = 0;
        nums[9] = 0;

        for (int i = 0; i < nums.length; i++){
            if ( nums[i] == 1 ){
                nums[i] = 0;
                System.out.println("nums[" + i +  "] = " + nums[i]);
            }
            else {
                nums[i] = 1;
                System.out.println("nums[" + i +  "] = " + nums[i]);
            }
        }
    }

    static void fillNumbers() {
        int[] arr = new int[8];
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            System.out.println("arr[" + i + "] = " + arr[i]);
            a = a + 3;
        }
    }

    static void compareNumbers(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for ( int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
                System.out.println("arr[" + i +  "] = " + arr[i]);
            }
            else {
                System.out.println("arr[" + i +  "] = " + arr[i]);
            }
        }

    }

    static void tableDi(){
        int [][] table = new int [11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (i == j || 11 - 1- i == j) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void minAndMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8};
        int min = 1000;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.print("Min: " + min);
        System.out.println();
        System.out.print("Max: " + max);
        System.out.println();
    }

    static boolean checkBalance(int[] arr){
        int leftI=0;
        int rightI=arr.length-1;
        int left = arr[0];
        int right = arr[arr.length-1];

        while ( rightI - leftI != 1 ){

            if ( arr[leftI] < arr[rightI]){
                left = left + arr[leftI + 1];
                leftI++;
            }
            else if ( arr[leftI] > arr[rightI] ) {
                right = right + arr[rightI - 1];
                rightI--;
            }
            else if ( arr[leftI] == arr[rightI]){
                left = left + arr[leftI + 1];
                leftI++;
                right = right + arr[rightI - 1];
                rightI--;
            }

        }

        if (left == right){
            return true;
        }
        else {
            return false;
        }

    }

    static void moveArray(int[] arr, int n) {
        int buf;

        if ( n > 0) {
            for (int i = 0; i < n; i++) {
                buf = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = buf;
            }
        }
        else if ( n < 0) {
            for ( int i = arr.length; i > n; i++) {
                buf = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = buf;
            }
        }
    }
}

//QUESTION-3
//Find the repeated number
package BasicLogictest;

public class repeatedNumber {
    public static void main(String[] arg) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 20};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    System.out.println(arr[j]);
                }

            }

        }

    }
}

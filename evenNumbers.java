
//QUESTION-1
//Write a program to print only the even numbers of the array
package BasicLogictest;

public class evenNumbers {

    public static void main(String[] arg){

        int arr[]={12,21,32,52,65,44,21,1,22,87,12};
        System.out.println("Even numbers");
        for (int i=1;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.print( arr[i]+", ");
            }

        }
    }

}

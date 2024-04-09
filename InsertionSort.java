import java.util.Arrays;
public class InsertionSort {
    public static void insertionsort(int [] arr){
       
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 &&arr[j]<arr[j-1]){
              int temp=arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;
              j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={23,12,10,2,45,24};
        int n=arr.length;
        insertionsort(arr);
        System.out.println("sorted array:"+Arrays.toString(arr));
    }
}

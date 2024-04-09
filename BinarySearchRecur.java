import java.util.Scanner;

public class BinarySearchRecur {
 
 
    public static int binarySearch(int arr[],int low,int high,int target){
         
         int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                return binarySearch(arr,mid+1,high,target);
            }
            else{
                return binarySearch(arr,low,mid-1,target);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("enter the array:");
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target=sc.nextInt();
        int result=binarySearch(arr,0,arr.length-1,target);
        if(result==-1){
            System.out.println("Element is not found in an array");
        }else{
            System.out.println("element is present at index:"+result);
        }
    }
}

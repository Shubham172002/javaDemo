import java.util.Scanner;
class BinarySearch{
 public static int binarysearch(int arr[], int n){
    int low=0,high=arr.length-1;
    while(low<=high){
    int mid=low+(high-low)/2;
    if(arr[mid]==n){
        return mid;
    }else if(arr[mid]<n){
        low=mid+1;
    }
    else{
        high=mid-1;
    }
}
return 0;
 } 
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]=new int[8];
        int n=obj.nextInt();
        for(int i=0;i<8;i++){
            arr[i]=obj.nextInt();
        }
        int result= binarysearch(arr,n);
        if(result!=0){
            System.out.println(result);
        }
        else{
            System.out.println("element not found");
        }
    }
}
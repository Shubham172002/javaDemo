public class bubble2 {
    public static void bubblesort(int[] arr,int n){
        n=arr.length;
         for(int i=n-1;i>0;i--){
            boolean Swapped = false;
            for(int j=n-1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    Swapped = true;
                }
            }
            if(!Swapped){
                break;
            }
         }
        
    }
    public static void main(String[] args) {
        int[] arr= {20,10,3,2,16,23};
        int n=arr.length;
        bubblesort(arr , n);
        System.out.println("sorted array is");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

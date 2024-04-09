//import java.util.Scanner;

//public class factorial {
//
////    public static int solver(int n,int a) {
////
////       if(n==0) {
////           return 1;
////       }
////           else {
////
////           return a*solver(n - 1, a);
////       }
////
////
////    }
//
//
//    static int search(int arr[], int N, int X) {
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == X) {
//                return i;
//            } else {
//                return -1;
//            }
//        }
//    }
//
//
//
//
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter the number:");
//        System.out.print("  ");
//            int a=sc.nextInt();
//        System.out.print("Enter the power:");
//        System.out.print("  ");
//            int n=sc.nextInt();
//            int sum=search(arr );
//        System.out.println("Result is:"+sum);
//
//    }
//}
class factorial {

    static int search(int arr[], int N, int x)
    {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }



        }

     return -1;
    }

    public static void main(String[] args) {
      int  n = 4;
      int  arr[] = {1,2,3,4};
       int x = 3;
      int ans=search(arr,n,x);
        System.out.println(ans);

    }
}

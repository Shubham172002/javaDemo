import java.math.BigInteger;
import java.util.Scanner;
 class Bigpower {
    public static BigInteger findpower(BigInteger a,int b){
        BigInteger result,finalresult;
        try{
        if(b==1){
            return a;
        }else{
            result=findpower(a, b/2);
            finalresult=result.multiply(result);
            if(b%2==0){
                return finalresult;
            }else{
               return a.multiply(finalresult);
            }
        }}
        catch(Exception e){
            e.getStackTrace();
        }
        
    }
    public static void main(String[] abs){
        Scanner sc=new Scanner(System.in);
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();
        BigInteger result=findpower(a,b);
        System.out.print("Final result is:"+" "+result);

    }
}

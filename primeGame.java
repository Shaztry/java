public class problemGame{
    public static void main(String args[]){
        int m = 1;
        int n = 10;
        boolean isPrime = true;
        for(int i = m; i <= n; i++){
            for(int j = 2; j < i; i++){
                if(i % j == 0){
                    isPrime = false;
                }else{
                    isPrime = true;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
    }
}
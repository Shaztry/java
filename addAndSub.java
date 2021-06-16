import java.util.*;
public class addAndSub{
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int sub(int a, int b){
        int diff = a - b;
        return diff;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int ans1 = 0;
        System.out.println("Enter the number of numbers to add and sub..");
        int size = in.nextInt();
        int queArray[] = new int[size];
        System.out.println("Enter the Question..");
        for(int i=0; i<size; i++){
            queArray[i] = in.nextInt();
        }
        System.out.println("-----------------------");
        for(int i=0; i<size; i++){
            if(i<size){
                try{
                    ans1 = add(ans1,queArray[i]);
                }catch(ArrayIndexOutOfBoundsException e){
                    
                }
            }else{
                break;
            }
        }
        System.out.print(ans1+"\n");
        for(int i=0; i<size; i++){
            if(i==size)
                break;
            int ans2 = sub(ans1,queArray[i]);
            System.out.println("- "+queArray[i]);
            System.out.println("\n-----------------------");
            System.out.println(" "+ans2);
            ans1 = ans2;
        }
    }
}
import java.util.*;
public class divNum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numArr = new ArrayList<Integer>();
        System.out.println("Enter two nunbers for multiplication...");
        int num1 = in.nextInt();
        int num = in.nextInt();
        int rem = 0;
        int ans = 0;
        int count = 1;
        int prod = 1;
        int i = 0;
        int sum =0;
        int prodd = num1*num;
        System.out.println(prodd);
        while (num > 0){
            rem = num % 10;
            ans = rem * count;
            count *= 10;
            num /= 10;
            numArr.add(ans);
            i++;
        }
        System.out.println(numArr);
        for(int j=numArr.size()-1; j>=0; j--){
          int res = num1 * numArr.get(j);
          System.out.println(res);
          sum = sum + res;
        }
        System.out.println("final verification");
        System.out.println(sum);
    }
}
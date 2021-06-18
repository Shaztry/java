import java.util.*;
public class divNum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int numArr[] = new int[];
        int num = in.nextInt();
        int rem = 0;
        int ans = 0;
        int count = 1;
        int prod = 1;
        int i = 0;
        while (num > 0){
            rem = num % 10;
            ans = rem * count;
            count *= 10;
            num /= 10;
            numArr[i] = ans;
            i++;
        }
        for(int j = 0; j <= i; j++){
            System.out.println(numArr[j]);
        }
    }
}
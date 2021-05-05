import java.util.Scanner;
public class CandidateCode{
    public static boolean isSub(String str1, String str2, int m, int n){
        if(m == 0)
            return true;
        if(n == 0)
            return false;
        if(str1.charAt(m - 1) == str2.charAt(n - 1))
            return isSub(str1, str2, m - 1, n - 1);
        return isSub(str1, str2, m, n - 1);
    }
    public static void main(String args[]) throws RuntimeException{
        Scanner in = new Scanner(System.in);
        String virusName = in.next();
        int numOfPatients = in.nextInt();
        String strArray[] = new String[numOfPatients];
        for(int i = 0; i < numOfPatients; i++){
            strArray[i] = in.next();
        }
        in.close();
        try{
            for(int i = 0; i < numOfPatients; i++){
                boolean ans = isSub(strArray[i], virusName, strArray[i].length(), virusName.length());
                if(ans)
                    System.out.print("POSITIVE");
                else
                    System.out.print("NEGATIVE");
                if(i != numOfPatients - 1)
                    System.out.println();
            }
        } catch(RuntimeException msg){
            System.out.print(msg);
        }
    }
}
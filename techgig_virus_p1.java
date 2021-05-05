import java.util.Scanner;
public class techgig_virus_p1{
    public static boolean isSub(String str1, String str2, int m, int n){
        if(m == 0)
            return true;
        if(n == 0)
            return false;
        if(str1.charAt(m - 1) == str2.charAt(n - 1))
            return isSub(str1, str2, m - 1, n - 1);
        return isSub(str1, str2, m, n - 1);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String virusName = in.next();
        int numOfPatients = in.nextInt();
        String strArray[] = new String[numOfPatients];
        for(int i = 0; i < numOfPatients; i++){
            strArray[i] = in.next();
        }
        for(int i = 0; i < numOfPatients; i++){
            boolean ans = isSub(strArray[i], virusName, strArray[i].length(), virusName.length());
            if(ans)
                System.out.println("POSITIVE");
            else
                System.out.println("NEGATIVE");
        } 
    }
}
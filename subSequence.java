public class subSequence{
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
        String str1 = "xyz";
        String str2 = "abcdrfgh";
        boolean ans = isSub(str1, str2, str1.length(), str2.length());
        if(ans)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
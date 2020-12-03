//Read ME
/*
    This is done by me... 
    Basically pythogorean day in the sense.. Day Square + Month Square should be equal to Year square
    i.e -> dd(dd) + mm(mm) = yy(yy)
    just like Pythogoras Theorem -> a(a) + b(b) = c(c)
    well here there is no major mistakes...
    but i havent used any exceptions. just some basic conditions.
    Hope you enjoy
*/

import java.util.Scanner;
public class Pytho_year{
    public static boolean calculate(int dd, int mm, int yy){
        switch(mm){
            case 1: if(dd > 31){ System.out.print("Enter valid date..."); }
            break;
            case 2: if(yy%4 == 0){
                if(dd > 29){ System.out.print("Enter valid date..."); }
            }else{
                if(dd > 28){ System.out.print("Enter valid date..."); }
            }
            break;
            case 3: if(dd > 31){ System.out.print("Enter valid date..."); }
            break;
            case 4: if(dd > 30){ System.out.print("Enter valid date..."); }
            break;
            case 5: if(dd > 31){ System.out.print("Enter valid date..."); }
            break;
            case 6: if(dd > 30){ System.out.print("Enter valid date..."); }
            break;
            case 7: if(dd > 31){ System.out.print("Enter valid date..."); }
            break;
            case 8: if(dd > 31){ System.out.print("Enter valid date..."); }
            break;
            case 9: if(dd > 30){ System.out.print("Enter valid date..."); }
            break;
            case 10: if(dd > 31){ System.out.print("Enter valid date..."); }
            break;
            case 11: if(dd > 30){ System.out.print("Enter valid date..."); }
            break;
            case 12: if(dd > 31){ System.out.print("Enter valid date..."); }
            break;
            default: System.out.print("Enter valid month...");

        }
        if(yy >= 100){
            yy = yy % 100;
        }
        System.out.println("Date : "+dd+"-"+mm+"-"+yy);
        if(dd*dd + mm*mm == yy*yy){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a date to Calculate Whether it is Pythogorean Year or not");
        System.out.println("Please enter the year within the range of 100...");
        System.out.print("Enter date(dd): ");
        int d = in.nextInt();
        System.out.print("Enter month(mm) : ");
        int m = in.nextInt();
        System.out.print("Enter Year(yy) : ");
        int y = in.nextInt();
        if(calculate(d,m,y)){
            System.out.println("Given date is Pythogorean Year...");
        }else{
            System.out.println("Given date is not a Pythogorean Year...");
        }
    }
}
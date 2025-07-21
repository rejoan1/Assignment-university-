import java.util.Scanner;

class leap_year{
    public static void main(String args[]){
        int year;
        System.out.println("Enter year:");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("this is a leap year");
        }else{
            System.out.println("this is not a leap year");
        }
    }
}
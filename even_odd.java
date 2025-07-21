import java.util.Scanner;

class even_odd{
    public static void main(String args[]){
        int num,result;
        System.out.println("Enter Number:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        result = num % 2;

        if(result == 0){
            System.out.println("this is a even number");
        }else{
            System.out.println("this is a odd number");
        }
        
    }
}
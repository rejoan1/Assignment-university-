import java.util.Scanner;

class factorial{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("Enter number:");
        num = input.nextInt();

        if(num > 1){
            for(int i = 1; i <= num; i++){
                fact *= i;
            }
        }else{
            System.out.println("invalid number");
        }

        if(fact > 1){
            System.out.println("The factorial is:" + fact);
        }
    }
}
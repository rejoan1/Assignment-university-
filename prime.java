import java.util.Scanner;

class prime{
    public static void main(String args[]){
        int num;
        int status = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");

        num = input.nextInt();

        if(num > 1){
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    status += 1;
                    if(status > 2){
                        break;
                    }
                }
            }

            if(status > 2){
                System.out.println("This is not a prime number");
            }
            else{
                System.out.println("This is a prime number");
            }
        }else{
            System.out.println("This is not a prime number");
        }


    }
}
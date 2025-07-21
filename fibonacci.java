import java.util.Scanner;
class fibo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int num;
        int n2 = 1;
        int temp;
        System.out.println("Enter a number:");
        num = input.nextInt();

        for(int i = 0; i <= num; i++){
            System.out.println("The result is:");
            System.out.println(n1);
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            
        }

    }
}
import java.util.Scanner;

class Calculator{
    public static void main(String args[]){
        Scanner bucky = new Scanner(System.in);
        double firstnum, secondnum, answer;
        System.out.println("Enter first num");
        firstnum = bucky.nextDouble();
        System.out.println("Enter second num");
        secondnum = bucky.nextDouble();
        answer = firstnum + secondnum;
        System.out.println(answer);
    }
}
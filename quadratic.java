
/*Develop a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0. 
Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative, display a 
message stating that there are no real solutions*/

import java.util.Scanner;
public class program1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a, b, c \n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double d= Math.pow(b,2)-4*a*c;
        if(d<0){
            System.out.println("\n No real solutions \n");
        }
        else if(b==0){
            System.out.println("\n Root 1: "+(-b/2*a)+"\n Root 2: "+(-b/2*a));
        }
        else{
            double r1= -b+ (d/2*a);
            double r2= -b- (d/2*a);
            System.out.println("\n Root 1: "+r1+"\n Root 2: "+r2);
        }
    }
}

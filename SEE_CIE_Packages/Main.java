package program6;
import java.util.*;
import program6.CIE.*;
import program6.SEE.*;


public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int i,j,n;
        int total[]=new int[5];
        System.out.println("\n enter number of students: \n");
        n=sc.nextInt();
        student s[]=new student[n];
        internals in[]=new internals[n];
        external e[]=new external[n];

        System.out.println("\n enter "+n+" students details: \n");
        for(i=0;i<n;i++){

            s[i].accept();
            in[i].accept();
            e[i].accept();
            
        }


        System.out.println("\n details: \n");{
            for(i=0;i<n;i++)
            s[i].display();
            for(j=0;j<5;j++){
                total[j]=in[i].ciem[j]+ e[i].sem[j];
                System.out.println("\n total in "+(j+1)+" : "+total[j]);
            }
            
        }
    }
}

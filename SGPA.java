import java.util.*;
import java.lang.*;
public class SGPA {

String u;
String n;
int[]c=new int[5];
int m[]=new int[5];
double sgpa;
void accept(String usn, String name, int []credits,int marks[]) {
u=usn;
n=name;
c=credits;
m=marks;
}
 double calc() {
int totcr=0;
for(int i=0;i<5;i++) {
totcr+=c[i]*m[i];
}
sgpa=totcr/20;
return(sgpa);

}

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your usn, name \n");
String usn1;
String name1;
usn1=sc.nextLine();
name1=sc.nextLine();
int[]c1=new int[5];
int[]m1=new int[5];
System.out.println("\n Enter grade and respective credits");
for(int i=0;i<5;i++)
{
c1[i]=sc.nextInt();
m1[i]=sc.nextInt();
}
SGPA s=new SGPA();
s.accept(usn1, name1, c1, m1);
System.out.println("\n Name: "+name1+"\n usn: "+usn1);
System.out.println("\n SGPA:  ");
System.out.println(String.format("%.2f", s.calc()));
}

}
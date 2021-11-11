import java.util.*;
public class Book {
String name, author;
int price;
int num_pg;
void Book(String name, String author, int price, int num_pg) {
this.name=name;
this.author=author;
this.price=price;
this.num_pg=num_pg;


}
void accept() {

Scanner sc=new Scanner(System.in);
System.out.println("\n Enter name of the book \n");
name=sc.next();
System.out.println("\n Enter author \n");
author=sc.next();
System.out.println("\n Enter price \n");
price=sc.nextInt();
System.out.println("\n Enter number of pages \n");
num_pg=sc.nextInt();
}

public String toString() {
return("\n Name:"+name+"\n author: "+author+"\n price: "+price+"\n Number of pages: "+num_pg);
}

}



class Main{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter number of entries \n");
int n=sc.nextInt();
Book[] b1=new Book[n];
for(int i=0;i<n;i++)
{
b1[i]=new Book();
b1[i].accept();


}

for(int i=0;i<n;i++)
{
System.out.println("\n"+b1[i].toString());

}



}

}

package program6.CIE;

import java.util.Scanner;

public class student {
    protected Scanner sc=new Scanner(System.in);
    public String name,usn;
    public int sem;
    public void accept(){
        System.out.println("\n Enter name, usn, semester \n");
        name=sc.nextLine();
        usn=sc.next();
        sem=sc.nextInt();

    }
    public void display(){

        System.out.println("\n name: "+name+"\n usn: "+usn+"\n semester: "+sem);
    }
}

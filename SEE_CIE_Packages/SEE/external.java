package program6.SEE;

import program6.CIE.student;

public class external extends student{
   public int sem[]=new int[5];
    public void accept(){
        System.out.println("\n enter marks in SEE: \n");
        for(int i=0;i<5;i++){
            sem[i]=sc.nextInt();

        }

    }
    
}

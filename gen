/**Write a program to demonstrate generics with multiple object parameters */


class generic <T,V>{
    T ob1;
    V ob2;
    generic(T ob1, V ob2){
        this.ob1=ob1;
        this.ob2=ob2;

    }
    void show(){
        System.out.println("\n type of 1: "+ob1.getClass().getName());
        System.out.println("\n type of 2: "+ob2.getClass().getName());
    }

}


public class gen {
public static void main(String[] args){
generic<Integer,Double> g1= new generic<>(10,12.78 );
g1.show();
generic<Integer,String>g2=new generic(10, "string");
g2.show();


}    
}

class Exceptions{
public static void main(String agrs[]){
try{
int a=1;
int b=42/a;
int c[]={100};
c[40]=20;
}
catch(ArithmeticException e){
System.out.println("this exception is caught only for divison by zero not array indexed of bound");
}
catch(Exception e){
System.out.println("generic Exception Catch");
}
}
}
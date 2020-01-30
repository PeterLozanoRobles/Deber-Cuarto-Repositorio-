public class princMarciano{
public static void main(String args[]){

Marciano a=new Marciano();
System.out.println(a.getNumero_marcianos());

Marciano a1=new Marciano();
System.out.println(a.getNumero_marcianos());
System.out.println(a1.getNumero_marcianos());

a1.muerto();
System.out.println(a.getNumero_marcianos());
System.out.println(a1.getNumero_marcianos());

}}
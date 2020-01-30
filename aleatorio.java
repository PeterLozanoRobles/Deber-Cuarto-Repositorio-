import java.util.*;
public class aleatorio{
public static void main(String args[]){
int x=(int) (Math.random()*10);
int n=(int) (Math.random()*100);
//Sostener o generar un numero aleatorio decimal como 0,08*100=
System.out.println(x+" "+n);
//Comienzo de como saber cuantas letras hay en una palabra
  String saludo="Sr. ";
  String Nombre="Del Valle "+"Anthony";
  String Persona=saludo+Nombre;
  System.out.println(Persona);
  System.out.println(Persona.length());
//Ver la que tipo de dato escoger si long o doble. Con la letra L se puede usar una gran cantidad de numeros
  long dato=98888888888888L;
  int dato2=(int)dato;
  short dato3=(short)dato2;
  //short Toma un valor pequeño
  System.out.println("Cast");
  System.out.println(dato);
  System.out.println(dato2);
  System.out.println(dato3);
//Comparacion de numeros 
  if((x>=50)&&(n>=50))
	  System.out.println("Los dos son mayores o iguales a cincuenta");
  else
	  if((x<50)&&(n>=50))
	  System.out.println("X menor y n mayor a cincuenta");
  else
	  if((x>=50)&&(n<50))
			System.out.println("n menor a cincuenta y x mayor o igual a cincuenta");
		else
			System.out.println("Los dos son menores o igual a cincuenta");
//Numeros romanos
System.out.println("Ingrese un numero: ");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
switch(x){
	case 1:
         System.out.println("I");
		 break;
    case 2:
         System.out.println("II");
		 break;
    case 3:
         System.out.println("II");
		 break;
    case 4:
         System.out.println("IV");
         break;
    case 5:
         System.out.println("V");
         break;
}
//
char letras[]={'a','b','c','d'};
for(int i=0;i<letras.length;i++);
System.out.println(letras[i]);
for (char item:letras)
	System.out.println(item);
    System.out.println(Arrays.toString(letras));
}}
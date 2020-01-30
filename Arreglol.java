import java.util.*;
public class Arreglol{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
int[] arre = new int[12];
System.out.println("Ingrese 12 numeros");

for(int i=0;i<arre.length;i++){
        int x=sc.nextInt();
	arre[i]=x;
}

Arrays.sort(arre);

System.out.println("De manera descendente");
for (int i=arre.length-1;i>0;i--){
	System.out.println(arre[i]);
}
}}	
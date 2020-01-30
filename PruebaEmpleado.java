import java.util.Scanner;
public class PruebaEmpleado{
public static void main(String args[]){
Gerente prueba=new Gerente("Anthony","Estudiante","UG");
prueba.muestra();
System.out.println(prueba.puesto);
System.out.println("Ingrese un nuevo nombre: ");

Scanner nomb=new Scanner(System.in);

prueba.setNombre(nomb.nextLine());
//Se puede enviar directamente el dato dentro de los parentesis
prueba.muestra();
}}


import java.util.Date;
//Constructor
public class Empleado{
private String nomb;
private Date fechaNac;
public String puesto;

Empleado(String nomb,String puesto){
this.nomb=nomb;
fechaNac=new Date();
this.puesto=puesto;
}

//Sobrecarga de metodo
public void muestra()
{  System.out.println(nomb);
   System.out.println(puesto);
   System.out.println(fechaNac);
}

public void setNombre(String nomb){
//set=setear para modificar nombre porque era privado
   this.nomb=nomb;
}}
//Fin de constructor
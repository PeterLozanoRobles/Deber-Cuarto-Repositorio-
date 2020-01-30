public class PruebaFechaReunion{
public static void main(String args[]){
	FechaReunion FR=new FechaReunion(4,5,2019,6,7,8);
	FechaReunion FR1=new FechaReunion(8,6,2019,8,10,6);
	System.out.println("Fecha de inicio: "+FR.getdia()+"/"+FR.getmes()+"/"+FR.getanio()+" - "+FR.gethora()+":"+FR.getminuto()+":"+FR.getsegundo());
	System.out.println("Fecha de fin: "+FR1.getdia()+"/"+FR1.getmes()+"/"+FR1.getanio()+" - "+FR1.gethora()+":"+FR1.getminuto()+":"+FR1.getsegundo());
}}
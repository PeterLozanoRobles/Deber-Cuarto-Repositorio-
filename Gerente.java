public class Gerente extends Empleado{
String Departamento;
Gerente (String nomb,String puesto,String departamento){
//la palabra super busca todos los constructores
   
   super(nomb,puesto);
   Departamento=departamento;
  }
  
  //Polimorfismo=Tener herencia y metodos con nombres iguales, este solo se sobreescribe
  public void muestra()
  {
  System.out.println(Departamento);
}}

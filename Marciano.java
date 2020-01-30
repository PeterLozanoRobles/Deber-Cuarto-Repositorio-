class Marciano {
 boolean vivo;
 private static int numero_marcianos = 0;
 final String Soy = "marciano";

 void quienEres(){
 System.out.println("Soy un " + Soy);
 }

 Marciano(){
 vivo = true;
 numero_marcianos++;
 }
 void muerto(){
 if(vivo){             
 vivo = false;
 numero_marcianos--;
 }}
 
 int getNumero_marcianos(){
 return numero_marcianos;
 }
 
  /*Una variable con "final" nunca se le puede asignar valor
 void set_soy(String Soy){
 this.Soy=Soy;
 }
  */
}
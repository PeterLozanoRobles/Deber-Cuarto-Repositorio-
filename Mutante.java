public class Mutante extends Marciano implements Animal{
 	Mutante(){
	super();
 	getNombre();
 	getNombre(8);
	/*edad=50;  Este no cambia porque ya es final*/
 	}

//Compru�vese como si cambiamos el nombre del m�todo a nac()
//no compila ya que no henos sobreescrito todos los m�todos
//de la interfaz.
 	public void nace(){
 	System.out.println("hola mundo");
	System.out.println(super.getNumero_marcianos());
 	}

 	public void getNombre(){
 	System.out.println(nombre );
 	}

 	public void getNombre(int i){
 	System.out.println(nombre +" " +i);
 	}

 	public static void main (String[] args){
 	Perro3 dog = new Perro3();

//Compruevese como esta l�nea da un error al compilar debido
//a intentar asignar un valor a una variable final
// dog.edad = 8;
 	} 
} ///
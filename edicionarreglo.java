public class edicionarreglo{
int tamanio,limite;//
double []e;
arreglo(int v1, double v2)
{
e=new double[v1];
for (int i=0;i<e.length;i++)
e[i]=v2;
}
void muestra()
{
for(int i=0;i<e.length;i++)
System.out.println(e[i]);
}}
//Caracteristicas de un constructor 
//No retorna un valor, tampoco lleva void
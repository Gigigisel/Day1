public class Persona 
{
	String nombre;
	String sexo;
	int edad;

	public void comer(String comida){
		System.out.println (nombre+ "Esta comiendo"+comida);
	}
	public void estudiar(){
		System.out.println (nombre+ "Esta estudiando");
	}

	public void pedircermeza(){
		if (edad>=18)
		{
			System.out.println(nombre+ "Dar  cermeza");
		}
		else {
			System.out.println(nombre+ "No tienes edad para tomar");
		}
	}
}
// Cuando se ejecuta genera  2 archivos.c;ass
//A la hora de compilar se compila el que tiene el main en este caso  CURSO

class Curso
{
	public static void main (String[] args)
	{
		Persona gigi = new Persona();
		gigi.nombre="Giselle Olvera";
		gigi.sexo="Femenino";
		gigi.edad=21;
		gigi.comer("Torta cubana con chipotle ");
		gigi.estudiar();
		gigi.pedircermeza();

//la informmacion se puede extraer desde la base de datos y asignarse al parametro
		Persona bety = new Persona();
		bety.nombre="Beatriz";
		bety.sexo="Femenino";
		bety.edad=17;
		bety.comer("Tacos al pastor");
		bety.estudiar();
		bety.pedircermeza();

	}
}


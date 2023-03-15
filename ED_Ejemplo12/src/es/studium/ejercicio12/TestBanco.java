package es.studium.ejercicio12;

public class TestBanco
{

	public static void main(String[] args)
	{
		
		Cliente cliente1 = new Cliente("2563214K", "Beatriz", "Calle de la Amargura, 16");
		Cuenta cuenta1 = new Cuenta("ES2000",100.67f,cliente1);
		System.out.println("La cuenta de " + " " + cuenta1.getCliente().getNombre() + " " + " tiene "
				+ cuenta1.getSaldo() + " euros ");

		Cliente cliente2 = new Cliente("951423l", "Antonio", "Calle Precipicio, 20");
		Cuenta cuenta2 = new Cuenta("ES3010", 800.50f, cliente2);
		System.out.println("La cuenta de " + " " + cuenta2.getCliente().getNombre() + " " + " tiene "
				+ cuenta2.getSaldo() + " euros ");

		cuenta1.setSaldo(cuenta1.getSaldo() - 92.36f);
		cuenta2.setSaldo(cuenta2.getSaldo() + 92.36f);

		System.out.println("La cuenta de " + " " + cuenta1.getCliente().getNombre() + " " + " tiene "
				+ cuenta1.getSaldo() + " euros ");
		System.out.println("La cuenta de " + " " + cuenta2.getCliente().getNombre() + " " + " tiene "
				+ cuenta2.getSaldo() + " euros ");

	}

}

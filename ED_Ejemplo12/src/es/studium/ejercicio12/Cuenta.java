package es.studium.ejercicio12;

public class Cuenta
{

	private String numerocuenta;
	private float saldo;
	private Cliente cliente;

	public Cuenta()
	{
		numerocuenta = "";
		saldo = 0.0f;
		cliente = new Cliente();

	}

	public Cuenta(String numerocuenta, float saldo, Cliente cliente)
	{
		this.numerocuenta = numerocuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getNumerocuenta()
	{
		return numerocuenta;
	}

	public void setNumerocuenta(String numerocuenta)
	{
		this.numerocuenta = numerocuenta;
	}

	public float getSaldo()
	{
		return saldo;
	}

	public void setSaldo(float saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}



}

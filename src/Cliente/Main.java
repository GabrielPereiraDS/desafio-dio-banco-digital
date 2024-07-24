package Cliente;
import BancoDigital.Banco;
import BancoDigital.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Gabriel");
		cliente.setSenha(1234);
		cliente.getNumConta();

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Venilton");
		cliente2.setSenha(5678);
		cliente2.getNumConta();

		Cliente cliente3 = new Cliente();
		cliente3.setNome("Derick");
		cliente3.setSenha(9876);
		cliente.getNumConta();

		Banco gerente = new Banco();
		gerente.addCliente(cliente);
		gerente.addCliente(cliente2);
		gerente.addCliente(cliente3);
		System.out.println("===CLIENTES DO BANCO===");
		System.out.println(gerente.getContaCliente());

		System.out.println("===CLIENTES NEGATIVADOS===");
		gerente.addClienteNegativado(cliente3);
		System.out.println(gerente.getclientesNegativados());

		
		



	}



}
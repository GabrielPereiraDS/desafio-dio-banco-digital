package BancoDigital;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Banco {

	private List<Cliente> contaCliente;
	private List<Cliente> clientesNegativados;

	public Banco() {
		this.contaCliente = new ArrayList<>();
		this.clientesNegativados = new ArrayList<>();
	}

	//CLIENTES
	public void addCliente(Cliente cliente){
		contaCliente.add(cliente);
	}
	public List<Cliente> getNomeCliente() {
		return contaCliente;
	}


	public List<Cliente> getContaCliente() {
		return contaCliente;
	}

	public void getContaCliente(List<Cliente> contaCliente) {
		this.contaCliente = contaCliente;
	}

	@Override
	public String toString() {
		return "Banco [contaCliente=" + contaCliente + "]";
	}

	//CLIENTES NEGATIVADOS

	public void addClienteNegativado(Cliente cliente){
		clientesNegativados.add(cliente);
	}

	public List<Cliente> getclientesNegativados() {
		return clientesNegativados;
	}

	public void getclientesNegativados(List<Cliente> contaCliente) {
		this.contaCliente = contaCliente;
	}
}



	

	








	


	

	

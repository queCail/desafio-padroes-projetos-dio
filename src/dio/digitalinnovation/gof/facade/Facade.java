package dio.digitalinnovation.gof.facade;

import subsistema1.crm.Crm;
import subsistema2.cepapi.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		Crm.gravarCliente(nome, cep, cidade, estado);
		
	}
}

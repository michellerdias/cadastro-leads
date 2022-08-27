package leads;
import java.util.ArrayList;

public class Lista {
	ArrayList<lead> listaDeLeads;  //Declarei a lista, mas não construí ela ainda
	
	public Lista() {
		this.listaDeLeads = new ArrayList<>();
	}
	
	void inserelead(lead novolead) {
		listaDeLeads.add(novolead);
	}
	void listarLeads() {
		System.out.println("Lista de Leads");
		
		for(lead leadNaLista:listaDeLeads) {
			leadNaLista.listar();
		}
	}
}

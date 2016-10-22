
public class Nodo {
	
	private Persona persona;
	private Familia familia;
	private Nodo siguiente;
	
	
	public Nodo(Persona persona, Familia familia) {
		this.persona = persona;
		this.familia = familia;
		siguiente=null;
	}


	public Nodo(Persona persona, Familia familia, Nodo siguiente) {
		this.persona = persona;
		this.familia = familia;
		this.siguiente = siguiente;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public Familia getFamilia() {
		return familia;
	}


	public void setFamilia(Familia familia) {
		this.familia = familia;
	}


	public Nodo getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
	
	
	
	

}

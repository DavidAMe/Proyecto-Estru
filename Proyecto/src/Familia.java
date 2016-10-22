
public class Familia {
	
	private String codigo;
	private String nombrefamilia;
	private String sector;
	private String direccion;
	private int teléfono;
	
	public Familia() {
		
	}
	
	public Familia(String codigo, String nombrefamilia, String sector,
			String direccion, int teléfono) {
		this.codigo = codigo;
		this.nombrefamilia = nombrefamilia;
		this.sector = sector;
		this.direccion = direccion;
		this.teléfono = teléfono;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombrefamilia() {
		return nombrefamilia;
	}

	public void setNombrefamilia(String nombrefamilia) {
		this.nombrefamilia = nombrefamilia;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(int teléfono) {
		this.teléfono = teléfono;
	}
	
	
	
	
	
	
	
	
	
	
	

}

public class FileOO2 implements FileManager{
	
	private String nombre;

	private String extension;

	public FileOO2(String nombre, String extension) {
		this.nombre = nombre;
		this.extension = extension;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getExtension() {
		return this.extension;
	}

	public String prettyPrint() {
		return "";
	}
}

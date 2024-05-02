public class FileDecorator implements FileManager{

	private FileManager file;
	
	public FileDecorator (FileManager file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return file.prettyPrint();
	}
	
	public String getNombre() {
		return file.getNombre();
	}

	public String getExtension() {
		return file.getExtension();
	}
}

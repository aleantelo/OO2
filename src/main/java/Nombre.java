public class Nombre extends FileDecorator{
	
	public Nombre(FileManager file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + this.getNombre();
	}

}
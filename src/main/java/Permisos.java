public class Permisos extends FileDecorator{
	
	public Permisos(FileManager file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + " permisos ";
	}

}

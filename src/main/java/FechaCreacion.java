public class FechaCreacion extends FileDecorator{
	
	public FechaCreacion(FileManager file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + " fecha creacion ";
	}

}

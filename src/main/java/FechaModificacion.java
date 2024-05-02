public class FechaModificacion extends FileDecorator{
	
	public FechaModificacion(FileManager file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + " fecha modificacion ";
	}

}

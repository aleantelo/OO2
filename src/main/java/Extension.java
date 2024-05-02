public class Extension extends FileDecorator{
	
	public Extension(FileManager file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public String prettyPrint() {
		return super.prettyPrint() + this.getExtension();
	}
}

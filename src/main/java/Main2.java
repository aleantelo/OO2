public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOO2 file = new FileOO2("pepe","txt");

		FileManager nombre = new Nombre(file);
		FileManager  extension = new Extension(nombre);

		System.out.println(extension.prettyPrint());

	}

}
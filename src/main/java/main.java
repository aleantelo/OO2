public class main {

    public static void main(String[] args) {
        ConsolaDirector consola = new ConsolaDirector();
        Personaje p = consola.construir(new ThorCreator());

        Personaje p2 = consola.construir(new MagoCreator());
        p2.realizarGolpe(p);
        System.out.println("VIDA DE THOR: " + p.getVida());
        p.realizarGolpe(p2);
        System.out.println("VIDA DE MAGO: " + p2.getVida());
    }
}

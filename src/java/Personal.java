public abstract class Personal {


    public double sueldo(){
        return this.basico() + this.adicional() - this.descuentos();
    }

    public abstract double basico();

    public abstract double adicional();

    public double descuentos(){
        return this.basico()*0.13 + this.adicional() * 0.5;
    }
}

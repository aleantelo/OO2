public abstract class Topografia {

    public abstract int proporcionDeAgua();

    public boolean igualAgua() {
        return false;
    }

    public boolean igualTierra() {
        return false;
    }

    public boolean igualMixta(CompositeTopografia topografiaMixta) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Topografia)){
            return false;
        }
        if(this == o){
            return true;
        }
    return this.equals((Topografia) o);
    }

    public abstract boolean equals(Topografia topografia);

}

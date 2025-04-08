public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    public Rectangulo (Coordenada c1, Coordenada c2){
        setEsquina1(c1);
        setEsquina2(c2);
    }
    public void setEsquina1 (Coordenada coo){
        this.esquina1 = new Coordenada(coo);
    }
    public void setEsquina2 (Coordenada coo){
        this.esquina2 = new Coordenada(coo);
    }
    public Coordenada getEsquina1 (){
        return new Coordenada(esquina1);
    }
    public Coordenada getEsquina2 (){
        return new Coordenada(esquina2);
    }
    @Override
    public String toString(){
        return "El rectangulo tiene coordenada: [ "+esquina1 + " - " + esquina2 + "] ";
    }
}

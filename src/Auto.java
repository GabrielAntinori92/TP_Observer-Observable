import java.util.Observable;

public class Auto extends Observable {

    private String name;
    private float nivelaceite;
    private float nivelagua;
    private float nivelpresion;

    public Auto(String name, float nivelaceite, float nivelagua, float nivelpresion){
        this.name = name;
        this.nivelaceite = nivelaceite;
        this.nivelagua = nivelagua;
        this.nivelpresion = nivelpresion;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getNivelaceite() {
        return nivelaceite;
    }
    public void setNivelaceite(float nivelaceite) {
        this.nivelaceite = nivelaceite;
    }
    public float getNivelagua() {
        return nivelagua;
    }
    public void setNivelagua(float nivelagua) {
        this.nivelagua = nivelagua;
    }
    public float getNivelpresion() {
        return nivelpresion;
    }
    public void setNivelpresion(float nivelpresion) {
        this.nivelpresion = nivelpresion;
    }


    public void valoresActuales(){
        String msg = getName() + ": Nivel Aceite: " + getNivelaceite() + ", Nivel Agua: " + getNivelagua() + ", Nivel Presion: " + getNivelpresion();
        setChanged();
        notifyObservers(msg);
    }

    public void valoresModificados(float nivelaceite, float nivelagua, float nivelpresion){

        valoresActuales();

        this.nivelaceite = nivelaceite;
        this.nivelagua = nivelagua;
        this.nivelpresion = nivelpresion;

        String msg = getName() + ": Nivel Aceite: " + getNivelaceite() + ", Nivel Agua: " + getNivelagua() + ", Nivel Presion: " + getNivelpresion();
        setChanged();
        notifyObservers(msg);
    }



}

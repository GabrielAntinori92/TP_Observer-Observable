public class Main {

    public static void main(String[] args){

        Mecanico mecanico = new Mecanico("Mecanico1");
        Auto auto = new Auto("Mazda",100f,100f,100f);//los niveles son porcentajes

        auto.addObserver(mecanico);

        auto.valoresModificados(45f,85f,75f);
    }

}


import java.util.Observable;
import java.util.Observer;

public class Mecanico implements Observer {

    private String name;

    public Mecanico(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {

    }
}

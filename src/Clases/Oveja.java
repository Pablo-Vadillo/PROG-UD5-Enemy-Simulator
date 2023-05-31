package Clases;

public class Oveja extends MobPacifico {
    public Oveja(int salud) {
        super(salud);
    }

    @Override
    public void moverse() {
        System.out.println("La Clases.Oveja se mueve por el campo.");
    }
}
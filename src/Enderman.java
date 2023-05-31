public class Enderman extends MobHostil {
    public Enderman(int salud, int fuerza) {
        super(salud, fuerza);
    }

    @Override
    public void moverse() {
        System.out.println("El Enderman se teletransporta detrás.");
    }
}
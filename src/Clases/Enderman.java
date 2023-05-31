package Clases;

public class Enderman extends MobHostil {
    public Enderman(int salud, int fuerza) {
        super(salud, fuerza);
    }

    @Override
    public void moverse() {
        System.out.println("El Clases.Enderman se teletransporta detrás.");
    }
}
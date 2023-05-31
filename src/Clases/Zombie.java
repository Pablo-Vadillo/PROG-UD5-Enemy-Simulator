package Clases;

import Clases.MobHostil;

public class Zombie extends MobHostil {
    public Zombie(int salud, int fuerza) {
        super(salud, fuerza);
    }

    @Override
    public void moverse() {
        System.out.println("El Clases.Zombie se mueve hacia el personaje.");
    }
}
package Clases;

import Interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    protected int fuerza;

    public MobHostil(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        salud -= ataque;
        System.out.println("¡El mob hostil recibió " + ataque + " puntos de daño! Salud restante: " + salud);
    }
}

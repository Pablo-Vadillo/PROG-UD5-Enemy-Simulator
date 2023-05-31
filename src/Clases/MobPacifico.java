package Clases;

import Interfaces.Daño;

public abstract class MobPacifico extends Mob implements Daño {
    public MobPacifico(int salud) {
        super(salud);
    }

    @Override
    public void recibirAtaque(int ataque) {
        salud -= ataque;
        System.out.println("¡El mob pacífico recibió " + ataque + " puntos de daño! Salud restante: " + salud);
    }
}
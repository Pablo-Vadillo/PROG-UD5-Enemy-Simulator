package Clases;

import Interfaces.Combate;

public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje(int defensa, int fuerza) {
        this.salud = 12;
        this.defensa = defensa;
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int dano = ataque - defensa;
        if (dano > 0) {
            salud -= dano;
        }
        System.out.println("¡El personaje recibió " + dano + " puntos de daño! Salud restante: " + salud);
    }

    public int getSalud() {
        return salud;
    }
}
package Clases;

import Clases.Enderman;
import Clases.MobHostil;
import Clases.Personaje;
import Clases.Zombie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego");

        Scanner scanner = new Scanner(System.in);


        System.out.println("¿Qué arma llevará el personaje?");
        System.out.println("1. Ninguna");
        System.out.println("2. Espada madera");
        System.out.println("3. Espada de hierro");
        System.out.println("4. Espada de diamante");
        int opcionArma = scanner.nextInt();


        System.out.println("¿Qué armadura llevará el personaje?");
        System.out.println("1. Ninguna");
        System.out.println("2. De cuero");
        System.out.println("3. De hierro");
        System.out.println("4. De diamante");
        int opcionArmadura = scanner.nextInt();


        int fuerza = obtenerFuerzaArma(opcionArma);
        int defensa = obtenerDefensaArmadura(opcionArmadura);
        Personaje personaje = new Personaje(defensa, fuerza);

        int turno = 1;
        boolean personajeGano = false;
        MobHostil mob = crearMobAleatorio();

        while (personaje.getSalud() > 0 && mob.salud > 0) {
            System.out.println("Turno " + turno);

            personaje.recibirAtaque(mob.atacar());
            if (personaje.getSalud() <= 0) {
                break;
            }

            mob.moverse();
            personajeGano = true;

            turno++;
        }

        if (personajeGano) {
            System.out.println("El personaje salió victorioso después de " + turno + " turnos.");
        } else {
            System.out.println("El personaje fue derrotado.");
        }
    }

    private static int obtenerFuerzaArma(int opcion) {
        switch (opcion) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 5;
            default:
                return 1;
        }
    }

    private static int obtenerDefensaArmadura(int opcion) {
        switch (opcion) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    private static MobHostil crearMobAleatorio() {
        int opcion = (int) (Math.random() * 2);
        if (opcion == 0) {
            return
                    new Zombie(10, 4);
        } else {
            return
                    new Enderman(14, 6);
        }
    }
}
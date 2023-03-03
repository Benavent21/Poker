package poker;

public class PrincipalPoker {
    /**
     * 1. EL usuario debe poder elejir el n de jugadores
     * 2. "" n de manos
     * 3. Cada mano debe durar 4 rondas.
     * 3. El sistema debe poder crear la partida
     * 4. El sistema debe poder repartir las dos cartas iniciales a cada jugador
     * 5. Los jugadores deben poder saber el valor de su mano (trio, pareja, ...)
     * 6. Los jugadores deben poder ir o retirarse cada ronda
     * 7. El sistema debe poder repartir el n correcto de cartas cada ronda de forma aleatoria
     * 8. La baraja debe contener solo una carta de cada nº y palo
     * 9. El sistema debe poder saber quien gana la ronda
     * 10. El sistema debe poder mantener un ranking de los jugadores
     * 11. Las cartas deben poder saber su valor
     * 12. Las cartas deben poder saber si son mayores que otra
     * 13. 
     * 
     * 
     * Clases:
     * Partida
     * Jugador
     * Baraja
     * Carta
     *
     *  
     * Partida:
     * Jugador[] jugadores;
     * int nRondas;
     * Baraja baraja;
     * 
     * ronda(); Posible switch
     * 
     * 
     * 
     * Jugador:
     * Carta[2] cartas;
     * int victorias;
     * String nombre;
     * 
     * 
     * 
     * Baraja:
     * private Carta[52] cartas;
     * private Pila<Carta> cartasRepartir;
     * 
     * init() que inicie la pila de forma random;
     * public repartirCarta();
     * 
     * 
     * 
     * Carta:
     * int valor;
     * char palo;
     * 
     * esMayor();
     * 
     */

     public static void main(String[] args) {
        
     }
}

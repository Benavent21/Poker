package poker;

public class Carta {
    
    int valor;
    char palo;

    public boolean esMayor(Carta carta){

        boolean salida = false;
        if(this.valor > carta.valor) {
            salida = true;
        }
        return salida;
    }
}

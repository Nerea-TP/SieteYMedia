package sieteymedia;
import recursos.Baraja;
import recursos.Carta;

public class SieteYMedia {
    private Baraja baraja;
    private Carta[] cartasJugador;
    private Carta[] cartasBanca;
    private boolean finTurno;

    public SieteYMedia(){
        baraja = new Baraja();
        baraja.barajar();
        // se van pidiendo cartas al jugar pero matemáticamente a partir de 15 siempre
        // nos pasamos
        // hay 12 cartas de medio puntos, si sacara estas 12 luego cartas con valor 1
        // vemos que a partir de 15 cartas siempre se pasas
        cartasJugador = new Carta[15];
        cartasBanca = new Carta[15];
    }

    public boolean esFinTurno(){
        if(valorCartas(cartasJugador)>7.5){
            finTurno=true;
        }else{
            finTurno=false;
        }
        return finTurno;
    }

    public Carta[] getCartasJugador(){
        return cartasJugador;
    }

    public Carta[] getCartasBanca(){
        return cartasBanca;
    }

    public double getValorCartasJugador(){
        return valorCartas(cartasJugador);
    }

    public double getValorCartasBanca(){
       return valorCartas(cartasBanca);
    }

    public void plantar(){
        finTurno=true;
    }

    public void darCartasJugador(){
       Carta c=baraja.darCartas(1)[0];

       int i = 0;
       while (cartasJugador[i] != null) {
           i++;
       } 
       cartasJugador[i] =c;
    }

    public void darCartasBanca(){
       Carta c=baraja.darCartas(1)[0];
       
       int i = 0;
       while (cartasBanca[i] != null) {
           i++;
       } 
       cartasBanca[i] =c;
    }

    public double valorCartas(Carta[] cartas) {
        double total = 0.0;
        int val;
        int i = 0;
        while (cartas[i] != null) {
            val = cartas[i].getNumero();
            total += (val > 7) ? 0.5 : val;
            i++;
            }
        return total;
    }
}

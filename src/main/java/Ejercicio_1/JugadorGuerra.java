package Ejercicio_1;

public class JugadorGuerra {
    private Dado dado;
    private String nombre;
    private int fichas;

    public JugadorGuerra(String nombre) {
        this.nombre = nombre;
        fichas = 10;
        dado = new Dado(6);
    }

    public Dado getDado() {
        return dado;
    }

    public int getFichas() {
        return fichas;
    }

    public String getNombre() {
        return nombre;
    }

    public void pierdoFicha(){
        fichas--;
    }

    public void ganoFicha(){
        fichas++;
    }

    public static void enfrentamiento (JugadorGuerra jugador1, JugadorGuerra jugador2){
        jugador1.getDado().Tirar();
        jugador2.getDado().Tirar();
        System.out.println(jugador1.nombre + " saco: " + jugador1.getDado().getUltimoValor() + " - " + jugador2.nombre + " saco: " + jugador2.getDado().getUltimoValor());
        if(jugador1.getDado().getUltimoValor() > jugador2.getDado().getUltimoValor()){
            jugador1.ganoFicha();
            jugador2.pierdoFicha();
            marcador(jugador1, jugador2);
        }else if(jugador1.getDado().getUltimoValor() < jugador2.getDado().getUltimoValor()){
            jugador1.pierdoFicha();
            jugador2.ganoFicha();
            marcador(jugador1, jugador2);
        }else {
            System.out.println("Empate");
        }
    }

    public static void marcador (JugadorGuerra jugador1, JugadorGuerra jugador2){
        System.out.println(jugador1.nombre + " : " + jugador1.getFichas() + " - " + jugador2.nombre + " : "+ jugador2.getFichas());
    }
}

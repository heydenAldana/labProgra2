package Nintendo;

import java.util.Random;

public class PokemonLegendario extends Pokemon
{
    // Atributos
    private int vidas;
    
    // Constructor
    public PokemonLegendario(String nombre, int ataque, int vida)
    {
        super(nombre, ataque, vida);
        this.vidas = setVidas();
    }
    
    // funcion get 

    public double getAtaqueIncrementadoAAgua() {
        return vidas;
    }
    
    
    // Funcion personal para establecer las vidas
    private int setVidas()
    {
        Random rand = new Random();
        int vida = rand.nextInt() + 2;
        return vida;
    }
}

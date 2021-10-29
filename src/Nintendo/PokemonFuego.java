package Nintendo;

public class PokemonFuego extends Pokemon
{
    // Atributos
    private double ataqueIncrementadoAPlanta;
    
    // Constructor
    public PokemonFuego(String nombre, int ataque, int vida)
    {
        super(nombre, ataque, vida);
        this.ataqueIncrementadoAPlanta = 0.35;
    }
    
    // funcion get 

    public double getAtaqueIncrementadoAPlanta() {
        return ataqueIncrementadoAPlanta;
    }
}

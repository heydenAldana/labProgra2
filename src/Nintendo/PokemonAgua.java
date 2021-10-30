package Nintendo;

public class PokemonAgua extends Pokemon 
{
    // Atributos
    private double ataqueIncrementadoAFuego;
    
    // Constructor
    public PokemonAgua(String nombre, int ataque, int vida)
    {
        super(nombre, ataque, vida);
        this.ataqueIncrementadoAFuego = 0.50;
    }
    
    // funcion get 

    public double getAtaqueIncrementadoAFuego() {
        return ataqueIncrementadoAFuego;
    }
    
    
}

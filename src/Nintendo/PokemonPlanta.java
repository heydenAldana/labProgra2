package Nintendo;

public class PokemonPlanta extends Pokemon
{
    // Atributos
    private double ataqueIncrementadoAAgua;
    
    // Constructor
    public PokemonPlanta(String nombre, int ataque, int vida)
    {
        super(nombre, ataque, vida);
        this.ataqueIncrementadoAAgua = 0.35;
    }
    
    // funcion get 

    public double getAtaqueIncrementadoAAgua() {
        return ataqueIncrementadoAAgua;
    }
}

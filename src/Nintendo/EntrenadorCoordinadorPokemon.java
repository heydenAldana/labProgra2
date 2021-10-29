package Nintendo;
import java.util.ArrayList;


public class EntrenadorCoordinadorPokemon extends Entrenador
{
    // Atributos
    private ArrayList<Pokemon> pokemon;
    
    // Constructor
    public EntrenadorCoordinadorPokemon (String nombre, int edad, char sexo)
    {
        super(nombre, edad, sexo);
        this.pokemon = new ArrayList<Pokemon>();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;

/**
 *
 * @author heyde
 */
public class EntrenadorLegendario extends Entrenador
{
    // Atributos
    private PokemonLegendario pokemonlegend;
    
    // COnstructor
    public EntrenadorLegendario (String nombre, int edad, char sexo, PokemonLegendario pokemonlegend)
    {
        super(nombre, edad, sexo);
        this.pokemonlegend = pokemonlegend;
    }
    
    // funciones get y set

    public PokemonLegendario getPokemonlegend() {
        return pokemonlegend;
    }

    public void setPokemonlegend(PokemonLegendario pokemonlegend) {
        this.pokemonlegend = pokemonlegend;
    }
    
}

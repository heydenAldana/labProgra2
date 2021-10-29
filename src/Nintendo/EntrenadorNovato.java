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
public class EntrenadorNovato extends Entrenador
{
    // Atributos de Entrenador novato
    private int numPokemon;
    private Pokemon pokemon;
    
    // constructor
    public EntrenadorNovato (String nombre, int edad, char sexo, int numPokemon, Pokemon pokemon)
    {
        super(nombre, edad, sexo);
        this.numPokemon = numPokemon;
        this.pokemon = pokemon;
    }
    
    // FUnciones get y set

    public int getNumPokemon() {
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
}

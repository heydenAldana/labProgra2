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
public class EntrenadorMaestroPokemon extends Entrenador
{
    // Atributos
    private int numvictorias;
    private Pokemon pokemon;
    
    // Constructor
    public EntrenadorMaestroPokemon (String nombre, int edad, char sexo, int numvictorias, Pokemon pokemon)
    {
        super(nombre, edad, sexo);
        this.numvictorias = numvictorias;
        this.pokemon = pokemon;
    }
    
    // Funciones get y set

    public int getNumvictorias() {
        return numvictorias;
    }

    public void setNumvictorias(int numvictorias) {
        this.numvictorias = numvictorias;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
}

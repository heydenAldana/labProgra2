package Nintendo;

import java.util.ArrayList;

public class Entrenador 
{
    // Atributos del entrenador
    private String nombre;
    private int edad;
    private char sexo;
    private ArrayList<Pokemon> pok;
    // Constructor
    public Entrenador (String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        pok = new ArrayList<Pokemon>();
    }
    
    // Funciones get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}

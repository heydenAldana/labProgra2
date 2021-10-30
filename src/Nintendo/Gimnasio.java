package Nintendo;

import java.util.ArrayList;
import java.util.Random;

public class Gimnasio 
{
    // Atributos del gimnasio
    private String nombre, ciudad, lider;
    private int victorias, derrotas;
    private double dinero;
    private ArrayList<Entrenador> entrenadores;
    
    // Constructor
    public Gimnasio (String nombre, String ciudad, String lider)
    {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lider = lider;
        this.victorias = 0;
        this.derrotas = 0;
        this.dinero = generarCapital();
        entrenadores = new ArrayList<Entrenador>();
    }
    
    // funciones get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    // Agrega un entrenador NOVATO al arraylist si no hay nombres repetidos
    public void agregarEntrenadorNovato(String nombre, int edad, char sexo, int cantidadpokemon, Pokemon pokemon)
    {
        for (Entrenador entrenadore : entrenadores) 
        {
            if(entrenadore.getNombre().equals(nombre))
            {
                System.out.println("---> ESTE NOMBRE YA EXISTE !!!");
                break;
            }
        }
        
        entrenadores.add(new EntrenadorNovato(nombre, edad, sexo, cantidadpokemon, pokemon));
    }
    
    // Agrega un entrenador MAESTRO al arraylist si no hay nombres repetidos
    public void agregarEntrenadorMaestro(String nombre, int edad, char sexo, Pokemon pokemon)
    {
        for (Entrenador entrenadore : entrenadores) 
        {
            if(entrenadore.getNombre().equals(nombre))
            {
                System.out.println("---> ESTE NOMBRE YA EXISTE !!!");
                break;
            }
        }
        
        entrenadores.add(new EntrenadorMaestroPokemon(nombre, edad, sexo, 0, pokemon));
    }
    
    // Agrega un entrenador CORRDINADOR al arraylist si no hay nombres repetidos
    public void agregarEntrenadorCoordinador(String nombre, int edad, char sexo)
    {
        for (Entrenador entrenadore : entrenadores) 
        {
            if(entrenadore.getNombre().equals(nombre))
            {
                System.out.println("---> ESTE NOMBRE YA EXISTE !!!");
                break;
            }
        }
        
        entrenadores.add(new EntrenadorCoordinadorPokemon(nombre, edad, sexo));
    }
    
    // Agrega un entrenador LEGENDARIO al arraylist si no hay nombres repetidos
    public void agregarEntrenadoLegendario(String nombre, int edad, char sexo, PokemonLegendario pokemon)
    {
        for (Entrenador entrenadore : entrenadores) 
        {
            if(entrenadore.getNombre().equals(nombre))
            {
                System.out.println("---> ESTE NOMBRE YA EXISTE !!!");
                break;
            }
        }
        
        entrenadores.add(new EntrenadorLegendario(nombre, edad, sexo, pokemon));
    }
    
    // Funcion que determina si hay mas coordinadores y legendarios del que deberia
    public boolean verificar()
    {
        int contarcoordinador = 0;
        for (Entrenador entrenadore : entrenadores) {
            if(entrenadore instanceof EntrenadorLegendario)
                return true;
            if(entrenadore instanceof EntrenadorCoordinadorPokemon)
            {
                contarcoordinador++;
                if(contarcoordinador >= 2)
                    return true;
            }
        }
        
        return false;
    }
    
    
    // Edita los datos del entrenador
    public void editarDatos(String nombreEntrenador, int edad, char sexo)
    {
        for (Entrenador entrenadore : entrenadores) 
        {
            if(entrenadore instanceof EntrenadorNovato || entrenadore instanceof EntrenadorLegendario ||
                    entrenadore instanceof EntrenadorCoordinadorPokemon || entrenadore instanceof EntrenadorMaestroPokemon)
            {
                entrenadore.setNombre(nombre);
                entrenadore.setEdad(edad);
                entrenadore.setSexo(sexo);
            }
        }
    }
    
    
    // Elimina al entrenador
    public void eliminarDatos(String nombre)
    {
        int pos = 0;
        for (Entrenador entrenadore : entrenadores) 
        {
            if(entrenadore.getNombre().equals(nombre))
                entrenadores.remove(entrenadores.get(pos));
            pos++;
        }
    }
    
    
    // Contar entrenadores
    public int contarentrenadores()
    {
        return entrenadores.size();
    }
    
    // Sacar entrenadores a pelear
    public void Entrenadoratacar(String enemigo)
    {
        
    }
    // funcion privada para generar el apial inicial
    private double generarCapital()
    {
        Random rand = new Random();
        int capital = (rand.nextInt(9) + 1) * 10000;
        return capital;
    }
}

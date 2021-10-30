/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nintendo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author heyde
 */
public class GestionMain 
{
    // -------------------- GIMNASIO SECTION -------------- //
    private ArrayList<Gimnasio> gym = new ArrayList<Gimnasio>();
    private Entrenador trainer;
    Scanner leer;
    
    // Agrega un gimnasio sy no hay nombres repetidos
    public void crearGimnasio(String nombre, String ciudad, String lider)
    {
        for (Gimnasio gimnasio : gym) 
        {
            if(gimnasio.getNombre().equals(nombre))
            {
                System.out.println("---> ESTE NOMBRE YA EXISTE !!!");
                break;
            }
        }
        gym.add(new Gimnasio(nombre, ciudad, lider));
        System.out.println("---> ESTE NOMBRE FUE REGISTRADO CON EXITO !!!");
        
        // Necesita un maestro entrenador si o si
        System.out.print("---> Escriba el nombre del entrenador maestro encargado: ");
        String nombreet = leer.nextLine();
        System.out.print("---> Escriba la edad del entrenador maestro encargado: ");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.print("---> Escriba el sexo ('M' || 'N' del entrenador maestro encargado: ");
        char sexo = leer.nextLine().charAt(0);
        System.out.print("---> Escriba el nombre del pokemon del entrenador maestro encargado: ");
        String nombreetpokemon = leer.nextLine();
        System.out.print("---> Escriba la vitalidad (200 - 500) del pokemon del entrenador maestro encargado: ");
        int vit = leer.nextInt();
        leer.nextLine();
        System.out.print("---> Escriba la cantidad de ataque del pokemoo del entrenador maestro encargado: ");
        int atack = leer.nextInt();
        leer.nextLine();
        
        for (Gimnasio gimnasio : gym) 
        {
            if(gimnasio.getNombre().equals(nombreet))
                gimnasio.agregarEntrenadorMaestro(nombreet, edad, sexo, new PokemonFuego(nombreetpokemon, atack, vit));
        }
    }
    
    // Edita los datos del gimnasio
    public void editarGimnasio(String nombre, String ciudad, String lider)
    {
        for (Gimnasio gimnasio : gym) 
        {
            if(gimnasio.getNombre().equals(nombre))
            {
                gimnasio.setNombre(nombre);
                gimnasio.setCiudad(ciudad);
                gimnasio.setLider(lider);
                System.out.println("---> LOS DATOS FUERON MIDIFICADOS CON EXITO !!!");
                break;
            }
        }
    }
    
    // Elimina el gimnasio por su nombre
    public boolean eliminarGimnasio (String nombre)
    {
        int pos = 0;
        for (Gimnasio gimnasio : gym) 
        {
            if(gimnasio.getNombre().equals(nombre))
            {
                gym.remove(pos);
                return true;
            }
            pos ++;
        }
        
        return false;
    }
    
    // Lista a todos los gimnasios que hay
    public String listarGimnasio()
    {
        String mensaje = "";
        
        for (Gimnasio gimnasio : gym) 
        {
            mensaje += "\n - NOMBRE: " + gimnasio.getNombre() + "\n - CIUDAD: " + gimnasio.getCiudad()
                    + "\n - LIDER DEL GIMNASIO: " + gimnasio.getLider() + "\n - NO. VICTORIAS: " + gimnasio.getVictorias() 
                    + "\n NO. DERROTAS: " + gimnasio.getDerrotas() + "\n - DINERO TOTAL: L." + gimnasio.getDinero();
            if(gimnasio.getDinero() <= 0)
                mensaje += "\n -> ESTAN EN BANCARROTA\n\n";
            else
                mensaje += "\n\n";
        }
        
        return mensaje;
    }
    
    
    // Obtiene el nombre de dicho gimnasio
    public String nombreGimnasio(String nombregym)
    {
        for (Gimnasio gimnasio : gym) 
        {
            if(gimnasio.getNombre().equals(nombregym))
                return gimnasio.getNombre();
        }
        return "";
    }
     
    // Verifica si existe todos los entrenadores disponibles o no ( los 6)
    public boolean verificarEntrenadores(String nombre)
    {
        for (Gimnasio gimnasio : gym) 
        {
            if(gimnasio.contarentrenadores() >= 6)
                return true;
        }
        return false;
    }
    
    
    
    
    // -------------------------- GESTION ENTRENADORES --------------------- //
    
    // Agrega un nuevo entrenador en dicho gimnasio
    public void agregarEntrenador (String nombreGimnasio, String nombreEntrenador, int edad, char sexo)
    {
        for (Gimnasio gimnasio : gym) 
        {
            if(nombreGimnasio.equals(gimnasio.getNombre()))
            {
                System.out.print("---> Eliga una de las opciones:\n"
                        + "1. Novato\n"
                        + "2. Maestro\n"
                        + "3. Coordinador\n"
                        + "4. Legendario\n");
                int opcion = leer.nextInt();
                leer.nextLine();
                
                System.out.print("---> Escriba el nombre del pokemon del entrenador: ");
                String nombreetpokemon = leer.nextLine();
                System.out.print("---> Escriba la vitalidad (200 - 500) del pokemon del entrenador: ");
                int vit = leer.nextInt();
                leer.nextLine();
                System.out.print("---> Escriba la cantidad de ataque del pokemoo del entrenador: ");
                int atack = leer.nextInt();
                leer.nextLine();
                System.out.print("\n---> Eliga una de las opciones:\n"
                    + "1. Tipo Fuego\n"
                    + "2. Tipo Agua\n"
                    + "3. Tipo Planta\n"
                    + "4. Tipo Legendario\n");
                int popcion = leer.nextInt();
                leer.nextLine();

                Pokemon e = null;

                if(popcion == 1)
                {
                    e = new PokemonFuego(nombreetpokemon, atack, vit);
                }
                else if(popcion == 2)
                {
                    e = new PokemonAgua(nombreetpokemon, atack, vit);
                }
                else if(popcion == 3)
                {
                    e = new PokemonPlanta(nombreetpokemon, atack, vit);
                }
                
                if(gimnasio.verificar())
                {
                    System.out.println("---> NO SE PUEDE AGREGAR AL ENTRENADOR. EXCEDE EL LIMITE DE ESTE TIPO");
                    break;
                }
                
                if(opcion == 1)
                    gimnasio.agregarEntrenadorNovato(nombreGimnasio, edad, sexo, popcion, e);
                else if(opcion == 2)
                    gimnasio.agregarEntrenadorMaestro(nombreGimnasio, edad, sexo, e);
                else if(opcion == 3)
                    gimnasio.agregarEntrenadorCoordinador(nombreGimnasio, edad, sexo);
                else if(opcion == 4)
                    gimnasio.agregarEntrenadoLegendario(nombreGimnasio, edad, sexo, new PokemonLegendario(nombreetpokemon, atack, vit));
            }
        }
    } 
    
    // edita los datos de dicho entrenador en dicho gimnasio
    public void editarEntrenador (String nombreGimnasio, String nombreEntrenador, int edad, char sexo)
    {
        for (Gimnasio gimnasio : gym) 
        {
            if(nombreGimnasio.equals(gimnasio.getNombre()))
            {
                gimnasio.editarDatos(nombreEntrenador, edad, sexo);
            }
        }
    }
    
    // Elimina al entrenador de dicho gimnasio
    public void eliminarEntrenador(String nombreGimnasio, String nombreEntrenador)
    {
        for (Gimnasio gimnasio : gym) 
        {
            if(nombreGimnasio.equals(gimnasio.getNombre()))
            {
                gimnasio.eliminarDatos(nombreEntrenador);
            }
        }
    }
    
    
    // ------------------ GESTION PELEAS ------------------ //
    
    
    // Elimina al entrenador de dicho gimnasio
//    public void atacar(String nombreGimnasio, String nombreEntrenador)
//    {
//        for (Gimnasio gimnasio : gym) 
//        {
//            if(nombreGimnasio.equals(gimnasio.getNombre()))
//            {
//                gimnasio.;
//            }
//        }
//    }
}

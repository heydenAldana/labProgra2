
package Nintendo;

import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        int nopcion = 0;
        Scanner leer = new Scanner (System.in);
        GestionMain main = new GestionMain();
        while (nopcion != 8)
        {
            System.out.println("1. Jugar\n"
                    + "2. Crear un gimnasio NUEVO\n"
                    + "3. Crear un entrenador NUEVO\n"
                    + "4. Editar un Entrenador\n"
                    + "5. Editar un Gimnasio\n"
                    + "6. Eliminar un Gimnasio o Entrenador\n"
                    + "7. Listar Gimnasios\n"
                    + "8. Salir\n"
                    + "---> ESCOJA UNA OPCION: ");
            nopcion = leer.nextInt();
            leer.nextLine();
            
            switch(nopcion)
            {
                case 1:
                    String gym1, gym2;
                    
                    // Selecciona los dos gimnasios
                    System.out.println("---> ESCRIBA EL NOMBRE DEL PRIMER GIMNASIO");
                    gym1 = leer.nextLine();
                    if(!main.verificarEntrenadores(gym1))
                    {
                        System.out.println("---> NO PUEDE JUGAR PORQUE NO HAY 6 ENTRENADORES EN EL GIMNASIO AUN");
                        break;
                    }
                    System.out.println("---> ESCRIBA EL NOMBRE DEL PRIMER GIMNASIO");
                    gym2 = leer.nextLine();
                    if(!main.verificarEntrenadores(gym2))
                    {
                        System.out.println("---> NO PUEDE JUGAR PORQUE NO HAY 6 ENTRENADORES EN EL GIMNASIO AUN");
                        break;
                    }
                    
////                    // Le da el turno al jugador 1 y van cambiando
////                    int turno = 0;
////                    while(turno != 2)
////                    {
////                       
////                    }
                    break;
                case 2:
                    System.out.print("---> Escriba el nombre del gimnasio: ");
                    String nombre = leer.nextLine();
                    System.out.print("---> Escriba el nombre de la ciudad del gimnasio: ");
                    String ciudad = leer.nextLine();
                    System.out.print("---> Escriba el nombre del lider del gimnasio: ");
                    String lider = leer.nextLine();
                    main.crearGimnasio(nombre, ciudad, lider);
                    break;
                case 3:
                    System.out.print("---> Escriba el nombre del entrenador: ");
                    String nombreet = leer.nextLine();
                    System.out.print("---> Escriba la edad del entrenador: ");
                    int edad = leer.nextInt();
                    leer.nextLine();
                    System.out.print("---> Escriba el sexo ('M' || 'N' del entrenador: ");
                    char sexo = leer.nextLine().charAt(0);
                    System.out.print("---> Escriba el nombre del gym del entrenador: ");
                    String nombregym = leer.nextLine();
                    main.agregarEntrenador(nombregym, nombreet, edad, sexo);
                    break;
                case 4:
                    System.out.print("---> Escriba el nombre del entrenador: ");
                    String nombreet2 = leer.nextLine();
                    System.out.print("---> Escriba la edad del entrenador: ");
                    int edad2 = leer.nextInt();
                    leer.nextLine();
                    System.out.print("---> Escriba el sexo ('M' || 'N' del entrenador: ");
                    char sexo2 = leer.nextLine().charAt(0);
                    System.out.print("---> Escriba el nombre del gym del entrenador: ");
                    String nombregym2 = leer.nextLine();
                    main.editarEntrenador(nombregym2, nombreet2, edad2, sexo2);
                    break;
                case 5:
                    System.out.print("---> Escriba el nombre del gimnasio: ");
                    String nombre2 = leer.nextLine();
                    System.out.print("---> Escriba el nombre de la ciudad del gimnasio: ");
                    String ciudad2 = leer.nextLine();
                    System.out.print("---> Escriba el nombre del lider del gimnasio: ");
                    String lider2 = leer.nextLine();
                    main.editarGimnasio(nombre2, ciudad2, lider2);
                    break;
                case 6:
                    System.out.println("---> DESEA ELIMINAR UN GIMNASIO (0) O UN ENTRENADOR (1) ? PRESIONE 0 o 1");
                    int bopcion = leer.nextInt();
                    leer.nextLine();
                    if(bopcion == 0)
                    {
                        System.out.print("---> Escriba el nombre del gimnasio: ");
                        String nombre3 = leer.nextLine();
                        main.eliminarGimnasio(nombre3);
                    }
                    else if(bopcion == 1)
                    {
                        System.out.print("---> Escriba el nombre del gimnasio del entrenador a eliminar: ");
                        String gym31 = leer.nextLine();
                        System.out.print("---> Escriba el nombre del entrenador: ");
                        String nombreet3 = leer.nextLine();
                        main.eliminarEntrenador(gym31, nombreet3);
                    }
                    break;
                case 7:
                    System.out.println(main.listarGimnasio());
                    break;
                default:
                    System.out.println("---> ELIGE UNA OPCION REAL!!!");
                    break;
            }
        }
    }
    
}

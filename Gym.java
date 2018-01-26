/*
 *   Escribe un programa que genere la tabla de entrenamiento de un usuario de un gimnasio. El programa
 *   debe pedir el día de la semana (de lunes a domingo) y debe mostrar de forma aleatoria la secuencia
 *   del entrenamiento en función de las siguientes pautas:
 *   a) El entrenamiento empieza siempre con un calentamiento aeróbico que puede ser bicicleta,
 *   elíptica o cinta.
 *   b) A continuación sigue el entrenamiento de un grupo muscular grande y de uno pequeño. Los
 *   grupos musculares grandes son espalda, pecho y piernas y los grupos musculares pequeños
 *   son bíceps, tríceps y hombros.
 *   c) El entrenamiento finaliza o bien con abdominales o bien con ejercicio aeróbico (bicicleta,
 *   elíptica o cinta). En caso de finalizar con aeróbico, no se puede repetir el ejercicio que se hizo
 *   en el calentamiento.
 *   d) Los miércoles y los domingos son días de descanso.
 */
package gym;

/**
 *
 * @author Francis
 */
import java.util.Scanner;

public class Gym {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String dia = "";
    boolean entrenamiento = false;
    int calentamiento = 0;
    int grupoGrande = 0;
    int grupoPeque = 0;
    int fin = 0;       
    do {
      System.out. println ("Introduzca el dia de la semana: ");
      dia = s.nextLine(); 
      
    } while (dia == "");
    switch (dia) {
      case "lunes":
        entrenamiento = true;
        break;
      case "martes":
        entrenamiento = true;
        break;
      case "miercoles":
        entrenamiento = false;
        break; 
      case "jueves":
        entrenamiento = true;
        break;
      case "viernes":
        entrenamiento = true;
        break;
      case "sabado":
        entrenamiento = true;
        break;
      case "domingo":
        entrenamiento = false;
        break;
    }
      
      
    if (!entrenamiento) {
      System.out.println ("Hoy es dia de descanso.");
    }
    if (entrenamiento) {
        
      calentamiento = (int)((Math.random() * 3) + 1);
      grupoGrande = (int)((Math.random() * 3) + 1);
      grupoPeque = (int)((Math.random() * 3) + 1);
      fin = (int)((Math.random() * 4) + 1);
        
      System.out.print("Su entrenamiento de hoy es el siguiente: ");
      switch (calentamiento) {
        case 1: 
          System.out.print ("bicicleta");
          break;
        case 2:
          System.out.print ("cinta");
          break;
        case 3:
          System.out.print ("eliptica");
          break;
      }
      switch (grupoGrande) {
        case 1:
          System.out.print (", espalda");
          break;
        case 2: 
          System.out.print (", pecho");
          break;
        case 3:
          System.out.print (", piernas");
          break;
      }
      switch (grupoPeque) {
        case 1:
          System.out.print (", biceps");
          break;
        case 2: 
          System.out.print (", triceps");
          break;
        case 3:
          System.out.print (", hombros");
          break;
      }
      while (fin == calentamiento) {
        fin = (int)((Math.random() * 4) + 1);
      }
      System.out.print ("");
      switch (fin) {
        case 1: 
          System.out.print (" y bicicleta");
          break;
        case 2:
          System.out.print (" y cinta");
          break;
        case 3:
          System.out.print (" y eliptica");
          break;
        case 4:
          System.out.print (" y abdominales");
          break;
      }
    }
    System.out.println();
  }
  
}

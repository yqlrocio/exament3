package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Examen_T3 {

    Scanner scanner = new Scanner(System.in);
    
	
	private static final int OPCION_SALIR = 7;
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        scanner.close();
	    }
    
   
	        
	 // EJERCICIO 1
     char [][] sala = new char [6][10]; 
     
     int fila = 0; 
     int columna = 0; 
     int numPersona; 
     
     String estado; 
     	estado = String.valueOf('R'); 
     	estado = String.valueOf('O'); 
     	estado = String.valueOf('L'); 

     // Muestra el menú principal
	    public static void mostrarMenu() {
	        System.out.println("1. Mostrar sala");  
	        System.out.println("2. Reservar asiento suelto");
	        System.out.println("3. Reservar grupo en una fila");
	        System.out.println("4. Confirmar reservas (R -> O)");
	        System.out.println("5. R -> L");
	        System.out.println("6. Estadísticas");
	        System.out.println("7. Salir"); 
	    }
		
	    public static void oncionUsuario() {
	    if (opcionUsuario > 0 && opcionUsuario < 8)) {
	    switch (opcionUsuario) {
	            case 1:
	            	pintarSala(sala);
	                break;
	            case 2:
	            	System.out.println("Introduce una fila");
	            	fila=scanner.nextInt(); 
	            	
	            	
	                break;
	            case 3:
	            	contarEstado("");
	                break;
	            case 4:
	            	reservarAsiento(sala);
	                break;
	            case 5:
	            	reservarGrupoEnFila(sala);
	                break;
	            case 6:
	            	reservarGrupoEnFila(sala);
	                break;  
	            default:
	                System.out.println("Opción no válida.");
	        }
	        return opcionUsuario;
	    }
     	
	// EJERCICIO 2
	// Crear Array
	public static int pintarSala (scanner, char sala) {
		// Recorre e imprime Array 
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(columna);
		for (int j = 0; j < numeros[i].length; j++) {
			System.out.println(fila);
		for (int k = 0; k < numeros[j].length; k++)
			System.out.println(contarEstado);
			System.out.print(numeros[i][j][k] + "\t");
		}
	System.out.println();
		}		
	}
	
	// EJERCICIO 3
	public static esPosicionValida (scanner, mensaje) {
		function esPosicionValida(sala, fila, columna) {
    // Verificar si 'fila' está dentro del rango
    if (fila < 0 || fila >= sala.length) {
        return false;
    }
    // Verificar si 'columna' está dentro del rango
    if (columna < 0 || columna >= sala[fila].length) {
        return false;
    }
    return true;
}

// Ejemplo de uso:
const sala = [
    [0, 0, 0],
    [0, 0, 0],
    [0, 0, 0]
];

console.log(esPosicionValida(sala, 1, 2)); // true
console.log(esPosicionValida(sala, 3, 0)); // false
console.log(esPosicionValida(sala, 0, -1)); // false

    }
	
	// EJERCICIO 4
	public static contarEstado () {
		
	}
	
	// EJERCICIO 5
	static int [] reservarAsiento (char [][] sala, int fila, int columna) {
		int [] asientosJuntosReservados = null; 
		int columna;
	}	
	return reservarAsiento;
	}
	
	// Comprobar fila
	if (fila < 6) {
		for (int indiceFila=0; indiceFila < 10; indiceFila++); {
			for (int indiceColumna=0; indiceColumna < 6; indiceColumna++); {
				if (rservaAsiento (sala, fila, columna)) {
				asientosJuntosReservado[0] = indiceColumna; {
				
				if(indiceColumna==numeroPersona) {
				asientosJuntosReservado[1] = indiceColumna; 
					}
				}
			}
	}
		return reservarAsiento;
	}
	
	// EJERCICIO 6
	public static void reservarGrupoEnFila (char [][], int numPersona) {
		char sala [][] = sala [indice];
		
		for (int indiceFila = 0; indiceFila < 6 ; indiceFilla++) {
			for (int indiceColumna = 0; indiceColumna <10; indiceColumna++) {
				if (sala[indiceFila][indiceColumna] =='R');
				if (sala[indiceFila][indiceColumna] =='L'); 
			}
		}
	
	return reservarGrupoEnFila	
	
	// FUNCIONES ADICIONALES
	static void confirmarReservas(char[][] sala) 
	
	static void cancelarReservas(char[][] sala)
	
	static void mostrarEstadisticas(String [] mensajes) {
		System.out.println("Mostrar estadisticas generales");
	
	// Crear variables
	int numLibres=0; 
	int numReservados=0; 
	int numOcupados=0; 
	
	// Bucle para reconocer la sala
	for (int indiceFila = 0; indiceFila < 6 ; indiceFilla++) {
		for (int indiceColumna = 0; indiceColumna <10; indiceColumna++) {
			if (sala[indiceFila][indiceColumna] =='R'); {
			numReservados++;
			else if(sala[indiceFila][indiceColumna] =='L'); {
				numOcupados++; 
				
					}
				}
			}
		}
	
	return mostrarEstadisticas; 
	}
	scanner.close(); 
	}
}

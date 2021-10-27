/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_colas;

import java.util.LinkedList;
import java.util.Queue;

public class Proyecto_Colas {

    public static void main(String[] args) {
        /* Creamos la cola Indicando el tipo de dato */
        Queue<Integer> cola = new LinkedList();
        
        for (int i = 0; i < 10; i++) {
            cola.offer(i); // Insertamos los datos
        }
        
        /* Imprimimos la cola llena */
        System.out.println("Cola llena :" + cola);
        
        /* Desencolamos y comparamos con null el valor */
        while(cola.poll()!= null){
            System.out.println(cola.peek()); // Muestra el nuevo Frente
        }
        
        /* Nuevo Frente, Muestra Null, la cola está vacia */
        System.out.println("Nuevo Frente :" + cola.peek());
        
    }

}

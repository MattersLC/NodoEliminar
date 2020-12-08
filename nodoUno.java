package nodo;

import java.util.Scanner;

public class nodoUno {
    
    Scanner sc = new Scanner(System.in);
    
    static class Nodo {
        String dato;
        Nodo sig;
    }
    
    Nodo fin = null;
    
    public boolean isEmpty(){
        return fin == null;
    }
    
    public void menu(){
        System.out.println("********** M E N Ú **********");
        System.out.print("1 - Agregar elemento \n"
                       + "2 - Mostrar elementos\n"
                       + "3 - Eliminar último elemento\n"
                       + "4 - Eliminar primer elemento\n"
                       + "5 - Salir\n"
                       + "Tu respuesta: ");
    }

    public void agregar() {
        Nodo temp;
        //String msg;
        System.out.print("\nAgregar el dato: ");
        if (fin == null) {
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
            System.out.println("Dato agregado!\n");
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;
            System.out.println("Dato agregado!\n");
        }
    }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (!isEmpty()) {
            System.out.println("\nMostrando datos:");
            while (actual != null && actual.dato != null) {
                System.out.print("DATO [" + actual.dato + "]\n");
                actual = actual.sig;
            }
            System.out.println("");
        } else {
            System.out.println("\n- - - - - - - - - - - - - -");
            System.out.println("- - - - Lista vacía - - - -");
            System.out.println("- - - - - - - - - - - - - -\n");
        }
    }
    
    public void eliminarUltimo() {
        Nodo del;
        del = fin;
        
        if(!isEmpty()){
            del.dato = null;
            del = del.sig;
            fin = del;
            System.out.println("\n- - - - - - - - - - - - - - - -");
            System.out.println("- - - Elemento eliminado! - - -");
            System.out.println("- - - - - - - - - - - - - - - -\n");
        } else {
            System.out.println("\n- - - - - - - - - - - - - -");
            System.out.println("- - - - Lista vacía - - - -");
            System.out.println("- - - - - - - - - - - - - -\n");
        }
        
    }
    
    public void eliminarPrimero() {
        Nodo primero = new Nodo();
        primero = fin;
        
        if (!isEmpty()){
            while (primero != null) {
                if (primero.sig == null){
                    primero.dato = null;
                }
                primero = primero.sig;
            }
            System.out.println("\n- - - - - - - - - - - - - - - -");
            System.out.println("- - - Elemento eliminado! - - -");
            System.out.println("- - - - - - - - - - - - - - - -\n");
        } else {
            System.out.println("\n- - - - - - - - - - - - - -");
            System.out.println("- - - - Lista vacía - - - -");
            System.out.println("- - - - - - - - - - - - - -\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        nodoUno n = new nodoUno();
        do {
            n.menu();
            
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;
                    
                case 3:
                    n.eliminarUltimo();
                    break;
                
                case 4:
                    n.eliminarPrimero();
                    break;
                    
                case 5:
                    System.out.println("\n- - - - - - - - - - -");
                    System.out.println("- - - - Adiós - - - -");
                    System.out.println("- - - - - - - - - - -\n");
                    break;
                    
                default:
                    System.out.println("\n- - - - - - - - - - - - - - - -");
                    System.out.println("- - - - Opción erronea- - - - -");
                    System.out.println("- - - - - - - - - - - - - - - -\n");
            }
        } while (opt != 5);
    }
}

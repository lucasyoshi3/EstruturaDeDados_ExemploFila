package view;

import controller.Fila;

public class Main {

    public static void main(String[] args) {
        Fila fila = new Fila(15);
        try {
            fila.enfileira("Matheus");
            fila.enfileira("Marcos");
            fila.enfileira("Lucas");
            fila.enfileira("Joao");
            fila.enfileira("Pedro");
            fila.enfileira("Tiago");
            fila.enfileira("Felipe");
            fila.imprime();
            
            System.out.println("Desenfileirou: " + fila.desenfileira());
            
            fila.imprime();
            
            fila.enfileira("Paulo");
            fila.enfileira("Timoteo");
            
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        fila.imprime();
    }
}

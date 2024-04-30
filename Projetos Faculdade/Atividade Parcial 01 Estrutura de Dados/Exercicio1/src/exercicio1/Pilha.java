/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;


/**
 * @author aluno
 */
public class Pilha {
    Node topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(int x) {
        if (topo == null) {
            topo = new Node(x);

        } else {
            Node novo = new Node(x);
            novo.setProx(topo);
            topo = novo;
        }
    }

    public int pop() {
        Node aux = topo;
        if (aux == null) {
            System.out.println("Tentativa de remover em pilha vazia");
            return -99999;
        } else {
            topo = topo.getProx();
            return aux.getX();
        }
    }

    public boolean isEmpty() {
        if (topo == null) return true;
        else return false;
    }

    public String conversor(int x) {
        int resto;
        while (x > 0) {
            resto = x % 2;
            push(resto);
            x = x / 2;
        }

        Node aux = topo;
        int val = 0;
        String show = "";
        while (!isEmpty()) {
            val = pop();
            show += Integer.toString(val);
            aux = aux.getProx();
        }
        return show;
    }



}

package Pilas;

import java.util.Arrays;

public class PilaTabla {

    /*estará formada por una tabla enteros (Integer) para guardar los elementos apilados
y contendrá los siguiente métodos (ojo hay que hacer uso, siempre que sea posible, de la
propiedad indiceCima, no de los métodos propios de las tablas (Arrays)).
 Constructor por defecto (creará una pila vacía con 10 elementos)
 Constructor con una dimensión inicial (creará una pila vacía con el número de elementos
que se le indique por parámetro);
 Método que devolverá un booleano indicando si la pila está vacía;
 Método que devolverá un booleano indicando si la pila está llena;
 Método que devolverá el valor del elemento que se encuentra en la cima, o null si la pila
está vacía;
 Apilar un elemento en el primer lugar de la tabla, redimensionándola si es necesario;
 Desapilar un elemento del primer lugar de la tabla. Si está vacía la pila, devuleve null
 Metodo toString
 Método que devolverá un entero indicando el número de elementos de la pila;*/

    private int indiceCima;
    private Integer[] pilaTabla;

    public PilaTabla() {
        this.indiceCima = -1;
        this.pilaTabla = new Integer[10];
    }

    public PilaTabla(int i) {
        this.indiceCima = -1;
        this.pilaTabla = new Integer[i];
    }

    public boolean pilaTablaVacia() {
        return indiceCima < 0;
    }

    public boolean pilaTablaLlena() {
        return indiceCima == pilaTabla.length - 1;
    }

    public Integer conocerCima() {
        Integer cima;
        if (pilaTablaVacia()) cima = null;
        else cima = indiceCima;
        return cima;
    }
    public int conocerNumElementos(){return indiceCima + 1;}


    public void apilar (Integer i){
        if (pilaTablaLlena()) pilaTabla = Arrays.copyOf(pilaTabla, pilaTabla.length + 10);
        indiceCima++;
        pilaTabla[indiceCima] = i;
    }
    public Integer desapilar () {
        Integer i;
        if (!pilaTablaVacia()) i = indiceCima--;
        else i=null;
        return i;
    }
}

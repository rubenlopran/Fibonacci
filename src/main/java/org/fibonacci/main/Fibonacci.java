package org.fibonacci.main;

public class Fibonacci {
    public Fibonacci(){}

    public int compute(int n)
    {
        if (n>1){
            return compute(n-1) + compute(n-2);  //función recursiva
        }
        else if (n==1) {  // caso base
            return 1;
        }
        else if (n==0){  // caso base
            return 0;
        }
        else{ //error
            throw new RuntimeException("Debes ingresar un tamaño mayor o igual a 0");
        }
    }
}

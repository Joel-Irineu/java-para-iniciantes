package com.mycompany.operadoresaritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /** ARITIMETICOS
         int n1 = 3;
         int n2 = 5;
         float m = n1+n2/2;
         System.out.println("A media é igual: " + m);
         **/
        
        /** UNARIOS 
         int numero = 10;
         int valor = 4 + numero--;
         System.out.println(valor);
         System.out.println(numero);
         */
        
        /** ATRIBUICAO
         int x = 4;
         x *= 2;
         System.out.println(x);
         */
         
        /** ARREDONDAMENTO
         float y = 8.5f;
         int ar = (int) Math.round(y);
         System.out.println(ar);
         */
        
        double ale =  Math.random();
        int num = (int) (5 + ale * (10-5));
        System.out.println(num);
                 
    }
}

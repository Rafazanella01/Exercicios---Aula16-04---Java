package com.mycompany.exerciciofuncionarios;
import com.mycompany.exerciciofuncionarios.Funcionario;
import com.mycompany.exerciciofuncionarios.MeuArrayList;


/**
 *
 * @author rafaz
 */
public class Main {
     public static void main(String[] args) {
        System.out.println("Hello World!");
        MeuArrayList ar = new MeuArrayList();
         
        Funcionario func = new Funcionario("Rafael Zanella", "Programador", 1300.32);
           
        ar.adicionarElementoArrayList(func);
       
        ar.exibirElementosArrayList();
    }
}

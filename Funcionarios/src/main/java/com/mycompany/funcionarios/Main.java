package com.mycompany.funcionarios;
import com.mycompany.funcionarios.MeuArrayList;

/**
 *
 * @author rafaz
 */
public class Main {
     public static void main(String[] args) {

        Funcionario func = new Funcionario("Rafael Zanella", "Programador", 1300.32);

        MeuArrayList ar = new MeuArrayList();
        
        String nome = func.getNome();
        
        System.out.println(nome);
        
        ar.adicionarElementoArrayList(func);
       
        ar.exibirElementosArrayList();
     }
}

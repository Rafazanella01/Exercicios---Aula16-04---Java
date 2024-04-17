package com.mycompany.exerciciofuncionarios;
import com.mycompany.exerciciofuncionarios.Funcionario;
import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author rafaz
 */
public class MeuArrayList {
      
    ArrayList<Funcionario> ar = new ArrayList<Funcionario>();
    
    public void adicionarElementoArrayList(Funcionario funcionario)
    {
        ar.add(funcionario);
    }
    
    public void excluirElementoArrayList(Funcionario funcionario)
    {
        ar.remove(funcionario);
    }
    
    public void exibirElementosArrayList() {
        for (Funcionario funcionario : ar) {
            System.out.println(funcionario);
        }
    } 
}

package com.mycompany.funcionarios;
import java.util.ArrayList;
import com.mycompany.funcionarios.Funcionario;
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

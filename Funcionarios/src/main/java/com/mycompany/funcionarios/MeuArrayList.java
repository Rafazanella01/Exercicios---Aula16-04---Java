package com.mycompany.funcionarios;
import com.mycompany.funcionarios.Funcionario;
import com.mycompany.funcionarios.Enum;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafaz
 */
public class MeuArrayList {
     ArrayList<Funcionario> ar = new ArrayList<Funcionario>();
     Scanner sc = new Scanner(System.in);
    
    public void adicionarElementoArrayList(Funcionario funcionario)
    {
        ar.add(funcionario);
    }
    
    public void excluirElementoArrayList(Funcionario funcionario)
    {
        ar.remove(funcionario);
    }
    
    public void exibirElementosArrayList()
    {
        for (Funcionario funcionario : ar) {
            System.out.println(funcionario);
        }
    } 
    
    public void editarElementoArrayList(Funcionario funcionario)
    {
        int indice = ar.indexOf(funcionario);
        
        // é retornado -1 se não for encontrado o elemento
        if (indice != -1){
            System.out.println("Digite o elemento que voce deseja digitar(Nome, Cargo, Salario): ");
            String op = sc.nextLine().toLowerCase();
            
            switch(op){
                case "nome":
                    System.out.println("Digite o nome a ser alterado: ");
                    String novoNome = sc.nextLine();
                    
                    funcionario.setNome(novoNome);
                    break;
                case "cargo":
                    System.out.println("Digite o novo cargo (Ceo, Desenvolver, Diretor): ");
                    String novoCargoStr = sc.nextLine().toLowerCase();
                    try {
                        Enum novoCargo = Enum.valueOf(novoCargoStr);
                        String novoCargoString = novoCargo.toString();
                        funcionario.setCargo(novoCargoString);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Cargo inválido.");
                    }
                    break;
                case "salario":
                    System.out.println("Digite o novo salario: ");
                    double novoSalario = sc.nextDouble();
                    funcionario.setSalario(novoSalario);
                    break;
                default:
                    System.out.println("Opção invalida.");
                    
            }
        } else{
             System.out.println("Funcionario não encontrado.");
        }
    }
}

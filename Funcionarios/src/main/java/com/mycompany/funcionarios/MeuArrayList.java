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
    
    public void adicionarElementoArrayList()
    {
        System.out.println("Digite o nome do funcionario: ");
        String nome = sc.nextLine();

        System.out.println("Digite o cargo (CEO, Desenvolvedor, Diretor): ");
        String cargoStr = sc.nextLine().toLowerCase();

        Enum cargo = Enum.valueOf(cargoStr);
        String cargoPronto = cargo.toString();
        
        System.out.println("Digite o salario: ");
        double salario = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer de entrada

        Funcionario func = new Funcionario(nome, cargoPronto, salario);

        ar.add(func);
    }
    
    public void excluirElementoArrayList()
    {
        System.out.println("Digite o nome do funcionario que deseja excluir: ");
        String nome = sc.nextLine();

        for (Funcionario funcionario : ar) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                ar.remove(funcionario);
                System.out.println("Funcionario removido com sucesso.");
                return;
            }
        }
        System.out.println("Funcionario nao encontrado.");
    }
    
    public void exibirElementosArrayList()
    {
        for (Funcionario funcionario : ar) {
            System.out.println(funcionario);
        }
    } 
    
    public void editarElementoArrayList(String nome)
    {
        for (Funcionario funcionario : ar) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Digite o elemento que voce deseja editar (Nome, Cargo, Salario): ");
                String op = sc.nextLine().toLowerCase();

                switch (op) {
                    case "nome":
                        System.out.println("Digite o novo nome: ");
                        String novoNome = sc.nextLine();
                        funcionario.setNome(novoNome);
                        break;
                    case "cargo":
                        System.out.println("Digite o novo cargo (CEO, Desenvolvedor, Diretor): ");
                        String novoCargoStr = sc.nextLine().toLowerCase(); 
                        try {
                            Enum novoCargo = Enum.valueOf(novoCargoStr);
                            String cargo = novoCargo.toString();
                            funcionario.setCargo(cargo);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Cargo invalido.");
                        }
                        break;
                    case "salario":
                        System.out.println("Digite o novo salario: ");
                        double novoSalario = sc.nextDouble();
                        funcionario.setSalario(novoSalario);
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                }
                return;
            }
        }
        System.out.println("Funcionario nao encontrado.");
    }
}

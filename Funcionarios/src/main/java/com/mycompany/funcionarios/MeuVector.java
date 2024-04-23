package com.mycompany.funcionarios;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Vector;
/**
 *
 * @author rafaz
 */
public class MeuVector {
    private java.util.Vector<Funcionario> funcionarios = new java.util.Vector<>();
    private Scanner sc = new Scanner(System.in);

    public void adicionarElementoVector()
    {
        System.out.println("Digite o nome do funcionario: ");
        String nome = sc.nextLine();

        System.out.println("Digite o cargo do funcionario (CEO, Desenvolvedor, Diretor): ");
        String cargo = sc.nextLine();

        System.out.println("Digite o salario do funcionario: ");
        double salario = Double.parseDouble(sc.nextLine());

        Funcionario func = new Funcionario(nome, cargo, salario);
        funcionarios.add(func);
    }

    public void excluirElementoVector()
    {
        System.out.println("Digite o nome do funcionario que deseja excluir: ");
        String nome = sc.nextLine();

        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario func = funcionarios.get(i);
            if (func.getNome().equalsIgnoreCase(nome)) {
                funcionarios.remove(i);
                System.out.println("Funcionario removido com sucesso.");
                return;
            }
        }
        System.out.println("Funcionario nao encontrado.");
    }

    public void exibirElementosVector()
    {
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }
    }
    
    public void editarElementoVector() {
        System.out.println("Digite o nome do funcionario que deseja editar: ");
        String nome = sc.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null && funcionario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Digite o elemento que voce deseja editar (Nome, Cargo, Salario): ");
                String op = sc.nextLine().toLowerCase();

                switch (op) {
                    case "nome":
                        System.out.println("Digite o novo nome do funcionario: ");
                        String novoNome = sc.nextLine();
                        funcionario.setNome(novoNome);
                        break;
                    case "cargo":
                        System.out.println("Digite o novo cargo (CEO, Desenvolvedor, Diretor): ");
                        String novoCargoStr = sc.nextLine().toUpperCase();
                        try {
                            Enum novoCargo = Enum.valueOf(novoCargoStr);
                            funcionario.setCargo(novoCargo.toString());
                        } catch (IllegalArgumentException e) {
                            System.out.println("Cargo invalido.");
                            return;
                        }
                        break;
                    case "salario":
                        System.out.println("Digite o novo salario do funcionario: ");
                        double novoSalario = Double.parseDouble(sc.nextLine());
                        funcionario.setSalario(novoSalario);
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                        return;
                }

                System.out.println("Funcionario editado com sucesso.");
                return;
            }
        }
        System.out.println("Funcionario nao encontrado.");
    }
}
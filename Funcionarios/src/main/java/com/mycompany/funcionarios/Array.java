package com.mycompany.funcionarios;
import java.util.Scanner;
import com.mycompany.funcionarios.Enum;

/**
 *
 * @author rafaz
 */
public class Array {
    private Funcionario[] funcionarios = new Funcionario[100];
    private int proximoIndice = 0;  
    private Scanner sc = new Scanner(System.in);

    
    public void adicionarElementoArray() {
        System.out.println("Digite o nome do funcionario: ");
        String nome = sc.nextLine();

        System.out.println("Digite o cargo do funcionario (CEO, Desenvolvedor, Diretor): ");
        String cargoStr = sc.nextLine();
        
        Enum cargo = Enum.valueOf(cargoStr);
        String cargoPronto = cargo.toString();

        System.out.println("Digite o salario do funcionario: ");
        double salario = Double.parseDouble(sc.nextLine());

        funcionarios[proximoIndice] = new Funcionario(nome, cargoPronto, salario);
        proximoIndice++; // Incrementa o índice para o próximo elemento
        System.out.println("Funcionario adicionado com sucesso!");
    }

    public void excluirElementoArray()
    {
        System.out.println("Digite o nome do funcionario que deseja excluir: ");
        String nome = sc.nextLine();

        for (int i = 0; i < proximoIndice; i++) {
            if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                // Movendo os elementos para trás para preencher a lacuna
                for (int j = i; j < proximoIndice - 1; j++) {
                    funcionarios[j] = funcionarios[j + 1];
                }
                proximoIndice--;
                System.out.println("Funcionario removido com sucesso.");
                return;
            }
        }
        System.out.println("Funcionario não encontrado.");
    }

    public void exibirElementosArray()
    {
        for (int i = 0; i < proximoIndice; i++) {
            System.out.println(funcionarios[i]);
        }
    }

   public void editarElementoArray()
   {
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

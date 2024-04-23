package com.mycompany.funcionarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static void mostrarMenu() {
        System.out.println("\n====== Menu ======");
        System.out.println("1. Adicionar Funcionario");
        System.out.println("2. Editar Funcionario");
        System.out.println("3. Excluir Funcionario");
        System.out.println("4. Exibir Funcionarios");
        System.out.println("5. Trocar de Estrutura");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opcao: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        do {
            System.out.println("Escolha o tipo de estrutura de dados:");
            System.out.println("1. ArrayList");
            System.out.println("2. Array Normal");
            System.out.println("3. Vector");
            System.out.println("4. Sair");
            System.out.print("Digite sua escolha: ");

            int escolhaEstrutura = sc.nextInt();
            sc.nextLine();

            switch (escolhaEstrutura) {
                case 1:
                    MeuArrayList ar = new MeuArrayList();
                    int op;
                    do {
                        mostrarMenu();
                        op = sc.nextInt();
                        sc.nextLine();
                        try {
                            switch (op) {
                                case 1:
                                    ar.adicionarElementoArrayList();
                                    break;
                                case 2:
                                    System.out.println("Digite o nome do funcionario a ser editado: ");
                                    String nome = sc.nextLine();
                                    ar.editarElementoArrayList(nome);
                                    break;
                                case 3:
                                    ar.excluirElementoArrayList();
                                    break;
                                case 4:
                                    ar.exibirElementosArrayList();
                                    break;
                                case 5:
                                    System.out.println("Trocar de Estrutura...");
                                    break;
                                case 6:
                                    System.out.println("Saindo...");
                                    sair = true;
                                    break;
                                default:
                                    System.out.println("Opcao invalida. Tente novamente.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("ENTRADA INVALIDA! Insira novamente.");
                            sc.next();
                            op = -1;
                        }
                    } while (op != 6 && !sair);
                    break;
                case 2:
                    Array array = new Array();
                    int op1;
                    do {
                        mostrarMenu();
                        op1 = sc.nextInt();
                        sc.nextLine();
                        try {
                            switch (op1) {
                                case 1:
                                    array.adicionarElementoArray();
                                    break;
                                case 2:
                                    array.editarElementoArray();
                                    break;
                                case 3:
                                    array.excluirElementoArray();
                                    break;
                                case 4:
                                    array.exibirElementosArray();
                                    break;
                                case 5:
                                    System.out.println("Trocar de Estrutura...");
                                    break;
                                case 6:
                                    System.out.println("Saindo...");
                                    sair = true;
                                    break;
                                default:
                                    System.out.println("Opcao invalida. Tente novamente.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("ENTRADA INVALIDA! Insira novamente.");
                            sc.next();
                            op1 = -1;
                        }
                    } while (op1 != 6 && !sair);
                    break;
                case 3:
                    MeuVector vec = new MeuVector();
                    int op2;
                    do {
                        mostrarMenu();
                        op2 = sc.nextInt();
                        sc.nextLine();
                        try {
                            switch (op2) {
                                case 1:
                                    vec.adicionarElementoVector();
                                    break;
                                case 2:
                                    vec.editarElementoVector();
                                    break;
                                case 3:
                                    vec.excluirElementoVector();
                                    break;
                                case 4:
                                    vec.exibirElementosVector();
                                    break;
                                case 5:
                                    System.out.println("Trocar de Estrutura...");
                                    break;
                                case 6:
                                    System.out.println("Saindo...");
                                    sair = true;
                                    break;
                                default:
                                    System.out.println("Opcao invalida. Tente novamente.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("ENTRADA INVALIDA! Insira novamente.");
                            sc.next();
                            op2 = -1;
                        }
                    } while (op2 != 6 && !sair);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (!sair);

        sc.close();
    }
}

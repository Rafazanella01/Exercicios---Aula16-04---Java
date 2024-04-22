package com.mycompany.funcionarios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;
import java.util.InputMismatchException;

public class Main {
    
     private static void mostrarMenu() {
            System.out.println("\n====== Menu ======");
            System.out.println("1. Adicionar Funcionario");
            System.out.println("2. Editar Funcionario");
            System.out.println("3. Excluir Funcionario");
            System.out.println("4. Exibir Funcionarios");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
        }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha o tipo de estrutura de dados:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Array Normal");
        System.out.print("Digite sua escolha: ");
        
        int escolhaEstrutura = sc.nextInt();
        sc.nextLine(); // Limpa o buffer

        MeuArrayList ar = null;
       

        switch (escolhaEstrutura) {
            case 1:
                ar = new MeuArrayList();
                mostrarMenu();
                int op = sc.nextInt();
                sc.nextLine();
                    do {
                        try {

                            switch (op) {
                                case 1:
                                        System.out.println("digite o nome do funcionario: ");
                                        String nome = sc.nextLine();
                                        System.out.println("digite o cargo(Ceo, Desenvolver, Diretor): ");
                                        String cargoStr = sc.nextLine().toLowerCase();
                                            
                                        Enum cargo = Enum.valueOf(cargoStr);
                                        String cargoString = cargo.toString();
                                           
                                            
                                        System.out.println("Digite o novo salario: ");
                                        double salario = sc.nextDouble();                                  
                                        
                                        Funcionario func = new Funcionario(nome, cargoString, salario);
                                        
                                    break;
//                                case 2:
//                                    break;
//                                case 3:
//                                    break;
//                                case 4:
//                                    break;
//                                case 5:
//                                    System.out.println("Saindo...");
//                                    break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("ENTRADA INVÁLIDA! Insira novamente.");
                            sc.next();
                            op = -1;
                        }
                    } while (op != 5);

                    sc.close();
                }
        }
    }

        

       
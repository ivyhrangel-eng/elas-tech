package Revisaosemana3petshop;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Petshop {

    static void mostrarFicha(Pet p) {
        System.out.println("Nome: " + p.nome);
    }

    static void mostrarFicha(Pet p, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + p.nome);
        System.out.println("Espécie: " + p.especie);
        System.out.printf("Peso: %.1f kg%n", p.peso);
        System.out.println("Porte: " + p.porte);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet[] lista = new Pet[5];
        int total = 0;
        int opcao = -1;

        ArrayDeque<String> filaBanho = new ArrayDeque<>();

        while (opcao != 0) {
            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pelo nome");
            System.out.println("4 - Ver espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo da fila");
            System.out.println("7 - Executar serviços (Banho, Tosa, Consulta)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        if (total >= lista.length) {
                            System.out.println("Cadastro cheio! O array está lotado.");
                            break;
                        }

                        System.out.print("Nome do pet: ");
                        String nome = sc.nextLine();

                        System.out.print("Espécie (Cachorro/Gato/Outro): ");
                        String especie = sc.nextLine();

                        System.out.print("Peso (kg): ");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Pet novoPet;
                        if (especie.equalsIgnoreCase("cachorro")) {
                            novoPet = new Cachorro();
                        } else if (especie.equalsIgnoreCase("gato")) {
                            novoPet = new Gato();
                        } else {
                            novoPet = new Pet();
                        }

                        novoPet.nome = nome;
                        novoPet.especie = especie;
                        novoPet.peso = peso;
                        novoPet.porte = novoPet.definirPorte();

                        lista[total] = novoPet;
                        total++;

                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("\n--- PETS CADASTRADOS ---");
                            for (int i = 0; i < total; i++) {
                                System.out.println(lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg - Porte " + lista[i].porte);
                                lista[i].emitirSom();
                            }
                        }
                        break;

                    case 3:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado para buscar.");
                            break;
                        }
                        System.out.print("Qual pet você procura? ");
                        String busca = sc.nextLine();
                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.println("Encontrado: " + lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg");
                                achou = true;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;

                    case 4:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                            break;
                        }
                        HashSet<String> especies = new HashSet<>();
                        for (int i = 0; i < total; i++) {
                            especies.add(lista[i].especie);
                        }

                        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");
                        for (String esp : especies) {
                            System.out.println("- " + esp);
                        }
                        System.out.println("Total de espécies diferentes: " + especies.size());
                        break;

                    case 5:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomeFila = sc.nextLine();
                        filaBanho.add(nomeFila);
                        System.out.println(nomeFila + " entrou na fila.");
                        System.out.println("Fila agora: " + filaBanho);
                        break;

                    case 6:
                        if (filaBanho.isEmpty()) {
                            System.out.println("A fila de banho está vazia.");
                        } else {
                            String proximo = filaBanho.poll();
                            System.out.println("Próximo da fila: " + proximo);
                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + filaBanho);
                        }
                        break;

                    case 7:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado para executar serviços.");
                            break;
                        }
                        System.out.print("Nome do pet para os serviços: ");
                        String nomeServico = sc.nextLine();

                        ArrayList<Servico> servicos = new ArrayList<>();
                        servicos.add(new Banho());
                        servicos.add(new Tosa());
                        servicos.add(new Consulta());

                        for (Servico s : servicos) {
                            s.executar(nomeServico);
                        }
                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
package ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Apartamento> apartamentos = new ArrayList<>();

        boolean quit = false;

        while (!quit) {

            System.out.println("(1) Cadastro de apartamento" +
                    "\n(2) Cadastro de morador" +
                    "\n(3) Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando apartamento: ");
                    System.out.print("Andar: ");
                    int andar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Numero: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Metragem: ");
                    double metragem = sc.nextDouble();
                    sc.nextLine();
                    apartamentos.add(new Apartamento(numero, andar, metragem));

                    System.out.println("Situação:" +
                            "\n(1)Alugado" +
                            "\n(2)Financiado" +
                            "\n(3)Quitado");

                    apartamentos.get(apartamentos.size() - 1).setSituacaoAtual(sc.nextInt());
                    sc.nextLine();
                    break;
                case 2:
                    System.out.print("Andar do apartamento: ");
                    int num = sc.nextInt();
                    System.out.print("Numero do apartamento: ");
                    int num2 = sc.nextInt();

                    int indice = -1;
                    for (int i = 0; i < apartamentos.size(); i++) {
                        if (apartamentos.get(i).getNumero() == num2 && apartamentos.get(i).getAndar() == num) {
                            indice = i;
                        }
                    }

                    sc.nextLine();
                    if (indice > -1) {
                        System.out.print("Numero de moradores que moram no apartamento: ");
                        num = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < num; i++) {
                            System.out.print("Nome: ");
                            String nome = sc.nextLine();
                            System.out.print("Data de Nascimento: ");
                            String dataNascimento = sc.nextLine();
                            System.out.print("Sexo: ");
                            char sexo = sc.next().charAt(0);
                            sc.nextLine();
                            System.out.print("CPF: ");
                            String cpf = sc.nextLine();
                            System.out.print("Celular: ");
                            String celular = sc.nextLine();
                            System.out.print("Bloco: ");
                            int bloco = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Codigo de acesso: ");
                            String codigoAcesso = sc.nextLine();

                            apartamentos.get(indice).addMorador(new Morador(nome, dataNascimento, sexo, cpf, celular, apartamentos.get(indice).getNumero(), bloco, codigoAcesso));
                        }
                    } else {
                        System.out.println("Apartamento ainda nao possui dono!");
                    }
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }

        for (Apartamento apartamento : apartamentos) {
            System.out.println(apartamento);
        }
    }
}

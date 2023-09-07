import model.Banco;
import model.Conta;
import model.Pessoa;
import model.contas.Corrente;
import model.contas.Credito;
import model.contas.Poupanca;
import model.pessoas.Fisica;
import model.pessoas.Juridica;

import java.util.Scanner;

public class Executavel {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scfs = new Scanner(System.in);
    public static Pessoa teste = new Fisica("a","a",1111);
    public static Pessoa pessoa;
    public static Banco banco = new Banco("NoBanco",1771,2.4,0.2,"R. tal, B. Tal, N. 71");
    public static Conta conta;

    public static void main(String[] args) {

        criarPessoa();
        System.out.println(pessoa);
    }

    public static void menu(){

    }
    //region(CRIAÇÃO DE PESSOA)
    public static void criarPessoa(){
        boolean escolhaFeita = false; //criação dessa variaveis é normal, caso haja outra maneira prreciso descobrir
        do{
            escolhaFeita = false;// toda vez que o usuario chamar a função, nenhum resquisicio de um uso antigo tera sobrado.

            System.out.print("""
                 1 - PESSOA FISICA
                 2 - PESSOA JURIDICA
                 3 - NENHUMA
                 """);
            int opcaoPessoa = sc.nextInt();

            switch(opcaoPessoa){
                case 1 -> {pessoa = criarPessoaFisica(); escolhaFeita = true;}
                case 2 -> {pessoa = criarPessoaJuridica(); escolhaFeita = true;}
                case 3-> System.out.println("a");//arruma aqui ainda;
                default -> System.out.println("INSIRA UM VALOR VALIDO!");
            }
        }while(!escolhaFeita);
    }
    public static Pessoa criarPessoaFisica(){
        String nome = "", endereco = "";
        long cpf = 0;

            System.out.print("Insira seu nome : ");
            nome = scfs.nextLine();

            System.out.print("Insira seu cpf : ");
            cpf = sc.nextLong();

            System.out.print("Insira seu endereço : ");
            endereco = scfs.nextLine();

//((Fisica)teste).setCpf(cpf);  //exemplo de casting

        return new Fisica(endereco,nome,cpf);
    }
    public static Pessoa criarPessoaJuridica(){
        String razaoSocial = "", endereco = "";
        long cnpj = 0;

        System.out.print("Insira o nome de sua empresa: ");
        razaoSocial = scfs.nextLine();

        System.out.print("Insira seu CNPJ : ");
        cnpj = sc.nextLong();

        System.out.println("Insira o endereço de sua empresa : ");
        endereco = scfs.nextLine();

        return new Juridica(endereco,cnpj,razaoSocial);
    }
    //endregion

    //region(CRIAÇÃO DE CONTA)
    public static void menuCriarConta() {
        int opcao;
        do {
            System.out.print("""
                    MENU 
                    1 - CRIAR CONTA
                    2 - SAIR
                    OPÇÃO : """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> criarConta();
                case 2 -> System.out.println("Arruma aqui");
                default -> System.out.println("INSIRA UM VALOR VALIDO!");
            }
        }while(opcao != 1);
    }

    public static void criarConta() {

        System.out.print("Insira o CPF ou CNPJ do titular : ");
        long valorCC = scfs.nextLong();
        Pessoa titular = pessoa.saberPessoaReal(valorCC);
        System.out.println("Esse é você : " + titular);
        System.out.println("Insira o número da conta : ");
        int numeroConta = sc.nextInt();
        System.out.println("Insira o seu saldo inicial");
        double saldo = sc.nextDouble();
        System.out.println("Insira uma senha senha para sua conta : ");
        String senha = scfs.nextLine();

        conta = Banco.cadastrarConta(titular, numeroConta, senha, saldo);

        int opcao;
        do {
            System.out.print("""
                    ESCOLHA O TIPO DE CONTA
                    1 - CORRENTE
                    2 - CREDITO
                    3 - POUPANÇA
                    OPÇÃO : """);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Insira seu limite inicial");
                    double limite = sc.nextDouble();
                    conta = new Corrente(titular, senha, numeroConta, saldo, limite);
                }
                case 2 -> {
                    System.out.println("Insira seu limite inicial");
                    double limite = sc.nextDouble();
                    int diaFatura;
                    do {
                        System.out.println("Qual o melhor dia para o pagamento mensal da fatura : ");
                        diaFatura = sc.nextInt();
                    } while (diaFatura > 31 || diaFatura <= 0);
                    conta = new Credito(titular, senha, numeroConta, saldo, limite, diaFatura);
                }
                case 3 -> {
                    conta = new Poupanca(titular, senha, numeroConta, saldo);
                }
                default -> System.out.println("INSIRA UM VALOR VALIDO!");
            }
        }while(opcao != 1 || opcao != 2 || opcao != 3);

        System.out.println("Processo finalizado com sucesso!");
        System.out.println("Essa é sua conta : ");
        System.out.println(conta);
    }

    //endregiom
}
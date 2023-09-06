import model.Banco;
import model.Conta;
import model.Pessoa;
import model.pessoas.Fisica;
import model.pessoas.Juridica;

import java.util.Scanner;

public class Executavel {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scfs = new Scanner(System.in);
    public static Pessoa teste = new Fisica("1","a",1111);
    public static Pessoa pessoa;
    public static Banco banco;
    public static Conta conta;

    public static void main(String[] args) {

        System.out.println("Funciona commit pelo amor de deus");
        criarPessoa();
        System.out.println(teste);
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
                case 1 -> {criarPessoaFisica(); escolhaFeita = true;}
                case 2 -> {criarPessoaJuridica(); escolhaFeita = true;}
                case 3-> System.out.println("a");
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
    public static void menuCriarConta(){

        System.out.print("""
                MENU 
                1 - CRIAR CONTA
                2 - SAIR
                OPÇÃO : """);
        int opcao = sc.nextInt();

        switch(opcao){
            case 1 -> criarConta();
            case 2 -> System.out.println("Arruma aqui");
            default -> System.out.println("INSIRA UM VALOR VALIDO!");

            }
        }


    public static void criarConta(){

        System.out.print("Insira o CPF ou CNPJ do titular : ");
        long valorCC = scfs.nextLong();
        Pessoa titular = pessoa.saberPessoaReal(valorCC);
        System.out.println("Esse é você : " + titular);
        System.out.println("Insira o número da conta : ");
        int numeroConta = sc.nextInt();
        System.out.println("Insira seu limite : ");
        double limite = sc.nextDouble();
        System.out.println("Insira o seu saldo inicial");
        double saldo = sc.nextDouble();
        System.out.println("Insira uma senha senha para sua conta : ");
        String senha = scfs.nextLine();

        conta = Banco.cadastrarConta(titular,numeroConta,senha,saldo,limite);

        System.out.print("""
                ESCOLHA O TIPO DE CONTA
                1 - CORRENTE
                2 - CREDITO
                3 - POUPANÇA
                OPÇÃO : """);
        int opcao = sc.nextInt();

        switch(opcao){
            case 1 ->
        }
    }
    //endregiom
}
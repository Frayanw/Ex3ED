package programa;

import entidades.Pessoa;
import java.util.Scanner;

public class Exercicio3ED {

    public static void main(String[] args) {
        /*Fa�a um programa de consulta de telefones a partir de um nome informado como uma chave de
        dados. O programa deve:
        ? Conter uma classe Pessoa com os atributos nome, telefone e e-mail;
        ? Permitir a entrada de nomes de pessoas com seus respectivos telefones e e-mails, sendo a
        quantidade determinada pelo usu�rio, e armazen�-los em um vetor de objetos pessoas;
        ? Permitir ao usu�rio inserir qual o nome que ele deseja consultar o telefone. Ap�s a consulta,
        exiba o telefone da pessoa procurada. Informe tamb�m se o nome � inexistente no vetor de
        pessoas.*/

        Scanner entrada = new Scanner(System.in);
        int quantidadePessoas;
        int j = 1;
        String nome;
        String telefone = "";
        String email;
        Pessoa pessoa = new Pessoa();
        char simNao;
        System.out.println("Quantas pessoas deseja cadastrar ?");
        quantidadePessoas = entrada.nextInt();

        System.out.println("");

        Pessoa pessoas[] = new Pessoa[quantidadePessoas];

        for (int i = 0; i < pessoas.length; i++) {

            System.out.println("Digite o nome da " + j + "� pessoa");
            nome = entrada.next();
            pessoa.setNome(nome);

            System.out.println("Digite o telefone de " + pessoa.getNome());
            telefone = entrada.next();
            pessoa.setTelefone(telefone);

            System.out.println("Digite o email de " + pessoa.getNome());
            email = entrada.next();
            pessoa.setEmail(email);

            pessoas[i] = pessoa;

            System.out.println("");

            j++;
        }

        System.out.println("Deseja consultar um n�mero de telefone ?(S) para sim (N) para n�o");
        simNao = entrada.next().charAt(0);

        if (simNao == 'N') {
            System.out.println("Obrigado volte sempre");
        } else if (simNao == 'S') {
            System.out.println("Digite o nome que quer saber o n�mero de telefone");
            nome = entrada.next();
            int validar = 0;
            for (int i = 0; i < pessoas.length; i++) {
                if (nome.equals(pessoas[i].getNome())) {
                    validar = 1;
                    telefone = pessoas[i].getTelefone();
                } else {
                    validar = 2;
                }
            }
            if (validar == 1) {
                System.out.println("Nome encontrado");
                System.out.println("O telefone �: " + telefone);
            }else{
                System.out.println("Nome n�o encontrado");
            }
        }
    }

}

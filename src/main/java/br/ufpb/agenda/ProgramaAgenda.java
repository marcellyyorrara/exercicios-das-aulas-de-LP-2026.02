package br.ufpb.agenda;

public class ProgramaAgenda {
    public static void main(String[] args) {

        Contato contato = new Contato(
                "Victor",
                "83999999999",
                "joaov@gmail.com"
        );

        Endereco endereco = new Endereco(
                "Rua Principal",
                "123",
                "Centro",
                "Capim",
                "PB",
                "58287-000"
        );

        AgendaEnderecos agenda = new AgendaEnderecos();

        agenda.adicionarContato(contato);
        agenda.adicionarEndereco(endereco);

        System.out.println("=== AGENDA DE ENDEREÇOS ===");
        System.out.println(contato);
        System.out.println(endereco);
    }
}


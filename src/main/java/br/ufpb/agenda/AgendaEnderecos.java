package br.ufpb.agenda;

import java.util.ArrayList;
import java.util.List;

public class AgendaEnderecos {

    private List<Contato> contatos;
    private List<Endereco> enderecos;

    public AgendaEnderecos() {
        contatos = new ArrayList<>();
        enderecos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    @Override
    public String toString() {
        return "AgendaEnderecos{" +
                "contatos=" + contatos +
                ", enderecos=" + enderecos +
                '}';
    }
}


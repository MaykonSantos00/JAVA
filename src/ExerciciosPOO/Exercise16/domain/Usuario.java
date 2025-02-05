package ExerciciosPOO.Exercise16.domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private List<Item> itens;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.itens = new ArrayList<Item>();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }

    public void emprestarItem(Item item) {
        if (item.emprestar()) {
            this.itens.add(item);
            System.out.println("Item emprestado com sucesso!");
        }
    }

    public void devolverItem(Item item) {
        item.devolver();
        removerItem(item);
        System.out.println("Item devolvido com sucesso!");
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
        item.devolverItem();

    }

    public void removerItem(Item item) {
        this.itens.remove(item);
    }

    public int getId() {
        return id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public String getNome() {
        return nome;
    }
}

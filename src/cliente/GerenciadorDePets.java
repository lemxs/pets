package cliente;

import modelo.Pet;
import lista.Lista;

public class GerenciadorDePets {
    private Lista lista;

    public GerenciadorDePets() {
        this.lista = new Lista();
    }

    public void adicionarPet(String nome, int idade) {
        lista.inserir(new Pet(nome, idade));
    }

    public Pet buscarPetPorIdade(int idade) {
        return (Pet) lista.buscaBinaria(idade);
    }

    public void removerPetPorId(int id) {
        lista.remover(id);
    }

    public void exibirPets() {
        lista.exibir();
    }
}

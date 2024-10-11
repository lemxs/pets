package cliente;


/*
*  Professor Gerson Risso
 */
import modelo.Pet;




public class UsaLista {

    public static void main(String[] args) {
        GerenciadorDePets gerenciador = new GerenciadorDePets();
        gerenciador.adicionarPet("Gaia", 4);
        gerenciador.adicionarPet("Mel", 12);
        gerenciador.adicionarPet("Ronda", 4);
        gerenciador.adicionarPet("Tonica", 12);
        gerenciador.adicionarPet("Mustafá", 5);

        Pet pet = gerenciador.buscarPetPorIdade(4);
        if (pet != null) {
            System.out.println("Achei! " + pet);
        } else {
            System.out.println("Não achei!");
        }
        gerenciador.removerPetPorId(999);
        gerenciador.exibirPets();
    }
}

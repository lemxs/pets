package lista;

import modelo.Pet;

/*
 *  Professor Gerson Risso
 */
public class Lista {

    private No inicio, atual, aux;
    private int quantidade = 0;

    public boolean vazia() {
        return inicio == null;
    }

    public void inserir(Object dados) {
        if (inicio == null) {
            inicio = new No(dados, null, null);
            aux = inicio;
        } else {
            atual = new No(dados, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
        quantidade++;
    }

    public void exibir() {
        No x = atual;
        while (x != null) {
            System.out.println(x.getDados());
            x = x.getAnt();
        }
    }

    /**
     * Realiza a busca linear em uma lista ligada e retorna um array Sendo o
     * índice: 0 a referência para o objeto de pesquisa 1 a referência para um
     * objeto anterior ao de busca.
     *
     * @param id int
     * @return Object[]
     */
    private No pesquisa(int id) {
        No r = inicio;
        Pet pet;
        while (r != null) {
            pet = (Pet) r.getDados();
            if (id == pet.getId()) {
                return r;
            }
            r = r.getProx();
        }
        return null;
    }

    /**
     * Realiza a busca em uma lista ligada e retorna o objeto.
     *
     * @param pet Pet
     * @return Pet
     */
    public Object pesquisa(Pet pet) {
        No r = inicio;
        Pet petRef;
        while (r != null) {
            petRef = (Pet) r.getDados();
            if (petRef.getId() == pet.getId()) {
                return petRef;
            }
            r = r.getProx();
        }
        return null;
    }

    public void remover(int id) {
        No r = pesquisa(id);
        if (r != null) {
            if (r == inicio) {
                inicio = r.getProx();
                r.setProx(null);
            } else if (r == atual) {
                atual = atual.getAnt();
                atual.setProx(null);
                r.setAnt(null);
            } else {
                r.getProx().setAnt(r.getAnt());
                r.getAnt().setProx(r.getProx());
                r.setAnt(null);
                r.setProx(null);
            }
        }
    }

    public Pet buscaBinaria(int id) {
        int metade = quantidade / 2;
        int i = 0;
        No x = inicio, y = atual;
        Pet pet;
        while (i <= metade) {
            pet = (Pet) x.getDados();
            if (pet.getId() == id) {
                return pet;
            }

            pet = (Pet) y.getDados();
            if (pet.getId() == id) {
                return pet;
            }
            x = x.getProx();
            y = y.getAnt();
            i++;
        }
        return null;
    } 
}

package modelo;

/*
 *  Professor Gerson Risso
 */
public class Pet { //TAD

    private String nome;
    private int idade;
    private int id;
    private static int a = 1;

    public Pet() {
    }

    public Pet(int id){
     this.id=id;
    }
    
    public Pet(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.id = a++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Pet.a = a;
    }

    @Override
    public String toString() {
        return "Pet{" + "nome=" + nome + ", id=" + id + ", idade=" + idade + '}';
    }

}

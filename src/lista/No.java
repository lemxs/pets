package lista;

/*
 *  Professor Gerson Risso
 */
public class No {
  private Object dados;
  private No prox;
  private No ant;

    public No(Object dados, No prox, No ant) {
        this.dados = dados;
        this.prox = prox;
        this.ant = ant;
    }

    public Object getDados() {
        return dados;
    }

    public void setDados(Object dados) {
        this.dados = dados;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }
     
}

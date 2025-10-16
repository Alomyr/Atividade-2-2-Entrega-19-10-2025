package src.main.java.com.atividadeDePratica.lp2;
import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private List<T> objetos;

    public Repositorio() {
        this.objetos = new ArrayList<>();
    }

    public void adicionar(T obj) { //metodo de adicao
        objetos.add(obj);
    }

    public void remover(T obj) { //metodo de remocao 
        objetos.remove(obj);
    }

    public T buscar(String chave) {
        for (T obj : objetos) {
            if (obj.toString().contains(chave)) {
                return obj;
            }
        }
        return null;
    }

    public void listar() {
        for (T obj : objetos) {
            System.out.println(obj);
        }
    }
}
/*
 * FIXME: Corrigir o README e fazer comentarios de doxygen;
 */
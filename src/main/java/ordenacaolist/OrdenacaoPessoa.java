package ordenacaolist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoas(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> porIdade = new ArrayList<>(pessoaList);
        Collections.sort(porIdade);
        return porIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> porAltura = new ArrayList<>(pessoaList);
        Collections.sort(porAltura, new ComparatorPorAltura());
        return porAltura;
    }


}

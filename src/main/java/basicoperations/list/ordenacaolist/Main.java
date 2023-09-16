package basicoperations.list.ordenacaolist;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();


        ordenacaoPessoa.addPessoas("pessoa1", 15, 1.90);
        ordenacaoPessoa.addPessoas("pessoa2", 20, 1.70);
        ordenacaoPessoa.addPessoas("pessoa3", 25, 1.85);
        ordenacaoPessoa.addPessoas("pessoa4", 30, 1.76);

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }
}

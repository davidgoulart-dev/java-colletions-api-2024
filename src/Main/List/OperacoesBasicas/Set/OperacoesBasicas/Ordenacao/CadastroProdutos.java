package Main.List.OperacoesBasicas.Set.OperacoesBasicas.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;

    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 1", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 14d, 15);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 13d, 25);
        cadastroProdutos.adicionarProduto(4L, "Produto 4", 15d, 25);
        cadastroProdutos.adicionarProduto(4L, "Produto 5", 15d, 15);
        cadastroProdutos.adicionarProduto(1L, "Produto 6", 11d, 25);


        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}

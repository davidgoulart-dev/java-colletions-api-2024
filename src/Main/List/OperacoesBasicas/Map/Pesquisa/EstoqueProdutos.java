package Main.List.OperacoesBasicas.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //Atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);

    }
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }

        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p: estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                maiorPreco = p.getPreco(); // Atualiza o maior preço
                produtoMaisCaro = p; // Atualiza o produto mais caro
            }

        }
return produtoMaisCaro;
}
    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();
        estoque.adicionarProduto(1L,"Drone C5-Inteligence", 15, 170000);
        estoque.adicionarProduto(2L,"AK-47 Black Rouse", 4, 64000);
        estoque.adicionarProduto(3L,"Mini Atomic Bomb C-1", 2, 37000);
        estoque.adicionarProduto(4L,"Desert Eagle Golden", 32, 43400);
        estoque.adicionarProduto(5L,"MP5 Falcon", 12, 73000);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro R$ " + estoque.obterProdutoMaisCaro());
    }

    }


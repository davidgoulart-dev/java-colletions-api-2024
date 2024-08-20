package Main.List.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor onde podemos criar a descrição e receber um Objeto do tipo Tarefa.
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

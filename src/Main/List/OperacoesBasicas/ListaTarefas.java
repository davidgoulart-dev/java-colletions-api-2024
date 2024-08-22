package Main.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
       List<Tarefa> tarefasParaRemover = new ArrayList<>();
       for(Tarefa t: tarefaList ){
           if(t.getDescricao().equalsIgnoreCase(descricao)){
               tarefasParaRemover.add(t);
           }

       }
       tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listatarefa = new ListaTarefas();
        System.out.println("O número total de elementos na lista é :" + listatarefa.obterNumeroTotalDeTarefas());

        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        listatarefa.adicionarTarefa("Tarefa 2");
        listatarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é :" + listatarefa.obterNumeroTotalDeTarefas());
        listatarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é :" + listatarefa.obterNumeroTotalDeTarefas());


        listatarefa.obterDescricoesTarefas();
    }

}

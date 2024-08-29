package Main.List.OperacoesBasicas.Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
        // chave é unica por isso não é necessário percorrer o array.
    }
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("David Goulart",249932405);
        agendaContatos.adicionarContato("Fabio Goulart",249932401);
        agendaContatos.adicionarContato("Sergio Machado",249932408);
        agendaContatos.adicionarContato("Paulo Aciolli",249932402);
        agendaContatos.adicionarContato("Denize Kronemberg",249932422);

        agendaContatos.exibirContato();
        agendaContatos.removerContato("Sergio Machado");
        agendaContatos.exibirContato();
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("David Goulart"));


    }
}


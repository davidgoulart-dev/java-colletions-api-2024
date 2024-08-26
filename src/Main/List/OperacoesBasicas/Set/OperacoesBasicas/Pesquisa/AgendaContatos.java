package Main.List.OperacoesBasicas.Set.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();

    }

    public void adcionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return  contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adcionarContato("Camila DIO", 123456);
        agendaContatos.adcionarContato("David Goulart", 224578);
        agendaContatos.adcionarContato("Marcus", 587214);
        agendaContatos.adcionarContato("Gabriela Miranda", 455674);
        agendaContatos.adcionarContato("Maria Damasceno" , 455634);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Gabriela Miranda"));

        System.out.println("Contato atualizado :" + agendaContatos.atualizarNumeroContato("Maria Damasceno", 555555));


    }
}

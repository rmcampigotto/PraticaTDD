import java.util.List;
import java.util.Objects;

public class Tarefa {

    private String nome;
    private String descricao;
    private Boolean pendente;

    public Tarefa (String nome, String descricao, Boolean pendente){
        this.nome = nome;
        this.descricao = descricao;
        this.pendente = pendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getPendente() {
        return pendente;
    }

    public void setPendente(Boolean pendente) {
        this.pendente = pendente;
    }

    public void AdicionarTarefa(List<Tarefa> list){
        list.add(this);
    }

    public void ConcluirTarefa(List<Tarefa> list, String nomeConcluir) {
        this.setPendente(false);
        System.out.println("Tarefa de nome: " + nomeConcluir + " concluída!");
    }

    public void EditarTarefa(List<Tarefa> list, String nomeAntigo, String nomeNovo, String descNova) {
        for (Tarefa t: list) {
            if (Objects.equals(t.getNome(),nomeAntigo)){
                t.setNome(nomeNovo);
                t.setDescricao(descNova);
                System.out.println("Tarefa de nome: " + nomeAntigo + " editada!");
            }else{
                System.out.println("Nenhuma tarefa com nome: " + nomeAntigo + " encontrada!");
            }
        }
    }

    public void ExcluirTarefa(List<Tarefa> list, String nomeExcluir) {
        for (Tarefa t: list) {
            if(Objects.equals(t.getNome(), nomeExcluir)){
                list.remove(t);
                System.out.println("Tarefa de nome: " + nomeExcluir + " excluída!");
            }else{
                System.out.println("Nenhuma tarefa com nome: " + nomeExcluir + " encontrada!");
            }
        }
    }
}

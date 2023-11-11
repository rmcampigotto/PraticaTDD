import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TarefaTests {

    private final List<Tarefa> list = new ArrayList<>();

    private final Tarefa tarefa = new Tarefa("Test Nome", "teste desc", true);

    @Test
    public void AdicionarTarefaTest(){
        tarefa.AdicionarTarefa(list);
    }

    @Test
    public void ConcluirTarefaTest(){
        tarefa.ConcluirTarefa(list, "Test Nome");
    }

    @Test
    public void EditarTarefaTest(){
        tarefa.EditarTarefa(list,"Test Nome","nome novo", "desc nova");
    }

    @Test
    public void ExcluirTarefaTest(){
        tarefa.ExcluirTarefa(list, "Test Nome");
    }


}

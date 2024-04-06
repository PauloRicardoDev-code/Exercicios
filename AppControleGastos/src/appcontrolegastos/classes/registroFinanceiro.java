package appcontrolegastos.classes;

import java.util.ArrayList;
import java.util.List;

public class registroFinanceiro {

    private List<Despesas> despesas;
    private List<Receitas> receitas;

    public registroFinanceiro() {
        this.despesas = new ArrayList<>();
        this.receitas = new ArrayList<>();
    }

    public void adicionarDespesa(Despesas despesa) {
        despesas.add(despesa);
    }

    public void adicionarReceita(Receitas receita) {
        receitas.add(receita);
    }

    public void listarReceitas() {
        System.out.println("Lista de Receitas:");
        for (Receitas receita : receitas) {
            System.out.println(receita.toString());
        }
    }

    public void listarDespesas() {
        System.out.println("Lista de Despesas:");
        for (Despesas despesa : despesas) {
            System.out.println(despesa.toString());
        }
    }
}
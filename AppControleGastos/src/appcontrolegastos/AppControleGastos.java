
package appcontrolegastos;

import appcontrolegastos.classes.Despesas;
import appcontrolegastos.classes.Receitas;
import appcontrolegastos.classes.registroFinanceiro;
import java.util.Date;


public class AppControleGastos {


    public static void main(String[] args) {
        
        registroFinanceiro registro = new registroFinanceiro();
        
        Despesas despesa = new Despesas(new Date(),"Mercado", 450.56);
        registro.adicionarDespesa(despesa);
        
        Receitas receita = new Receitas(new Date(),"Salario", 2000);
        registro.adicionarReceita(receita);
        
        
        registro.listarDespesas();
        registro.listarReceitas();
    }
    
}

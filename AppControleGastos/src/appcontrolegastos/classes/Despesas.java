package appcontrolegastos.classes;

import java.util.Date;

public class Despesas {

    private Date data;
    private String descricao;
    private double valor;

    public Despesas(Date data, String descricao, double valor) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Despesa{"
                + "valor = " + valor
                + ", categoria = '" + descricao + '\''
                + ", data = '" + data + '\''
                + '}';
    }
}

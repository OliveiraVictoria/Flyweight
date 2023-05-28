package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Medico> medicos = new ArrayList<>();

    public void plantao(String nomeMedico, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Medico medico = new main.Medico(nomeMedico, cidade);
        medicos.add(medico);
    }

    public List<String> obterMedicos() {
        List<String> saida = new ArrayList<String>();
        for (Medico medico : this.medicos) {
            saida.add(medico.obterMedico());
        }
        return saida;
    }


}

package padroesestruturais.flyweight;

import padroesestruturais.flyweight.Cidade;

public class Medico {

    private String nome;
    private Cidade cidadeHospital;

    public Medico(String nome, Cidade cidadeHospital) {
        this.nome = nome;
        this.cidadeHospital = cidadeHospital;
    }

    public String obterMedico() {
        return "Medico{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeHospital.getNome() + '\'' +
                ", uf='" + cidadeHospital.getUf() + '\'' +
                '}';
    }
}

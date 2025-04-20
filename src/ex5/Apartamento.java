package ex5;

import java.util.ArrayList;

public class Apartamento {

    private int numero, andar;
    private double metragem;
    private String situacaoAtual;
    private ArrayList<Morador> moradores = new ArrayList<>();

    private enum Situacao {ALUGADO, FINANCIADO, QUITADO}

    public Apartamento(int numero, int andar, double metragem) {
        this.numero = numero;
        this.andar = andar;
        this.metragem = metragem;
    }

    public int getNumero() {
        return numero;
    }

    public int getAndar() {
        return andar;
    }

    public void addMorador(Morador morador) {
        moradores.add(morador);
    }

    public void setSituacaoAtual(int situacaoAtual) {

        if (situacaoAtual == 1) {
            this.situacaoAtual = Situacao.ALUGADO.toString();
        } else if (situacaoAtual == 2) {
            this.situacaoAtual = Situacao.FINANCIADO.toString();
        } else if (situacaoAtual == 3) {
            this.situacaoAtual = Situacao.QUITADO.toString();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Apartamento " + numero + " " + andar + "° andar");
        sb.append("\nTamanho: " + metragem + "m²");
        sb.append("\nSituacao: " + situacaoAtual);
        sb.append("\nMoradores: ");
        for (Morador morador : moradores) {
            sb.append("\n" + morador);
        }
        return sb.toString();
    }
}

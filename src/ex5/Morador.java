package ex5;

public class Morador {

    private String nome, dataNascimento, cpf, celular;
    private char sexo;
    private int apto, bloco;
    private String codigoAcesso;

    public Morador(String nome, String dataNascimento, char sexo, String cpf, String celular, int apartamento, int bloco, String codigoAcesso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.celular = celular;
        this.apto = apartamento;
        this.bloco = bloco;
        this.codigoAcesso = codigoAcesso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nSexo: " + sexo +
                "\nCPF: " + cpf +
                "\nCelular: " + celular +
                "\nApartamento: " + apto +
                "\nBloco: " + bloco +
                "\nCodigo de Acesso: " + codigoAcesso;
    }
}
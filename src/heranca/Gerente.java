package heranca;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticavelUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticavelUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do GERENTE");
        return super.salario;
    }

}

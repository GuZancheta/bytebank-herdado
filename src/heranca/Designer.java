package heranca;

public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando método de bonificação do Designer");
        return 200;
    }

}

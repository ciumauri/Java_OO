public class Gerente extends Funcionario implements Autenticavel {

  private int senha;

  public double getBonificacao() {
    System.out.println("Chamou o metodo de bonificacao do Genrente");
    return super.getSalario();
  }

  @Override
  public void setSenha(int senha) {
    this.senha = senha;
  }

  @Override
  public boolean autentica(int senha) {
    if (this.senha == senha) {
      return true;
    } else {
      return false;
    }
  }
}

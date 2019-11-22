package db1start_aula05;

public class App {

	public static void main(String[] args) {
		Conta conta = new Conta();

		Conta contaTest = new Conta();

		conta.verificarConta();

		conta.verificarSaldo();

		conta.novoDeposito(100.0);

		conta.novoSaque(50.0);
		
		conta.verificarSaldo();

		conta.tranferir(10.0, contaTest);

		conta.extrato();

		contaTest.verificarConta();

		contaTest.verificarSaldo();

		contaTest.novoDeposito(150.0);

		contaTest.extrato();

	}
}

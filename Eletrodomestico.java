/* Uma classe abstrata serve como modelo para uma classe concreta.
*  
*  N�o podem ser instanciadas com o new, elas sempre devem ser herdadas por classes concretas.
*  
*  As classes abstratas podem conter ou n�o m�todos abstratos, que tem a mesma defini��o da assinatura de m�todo encontrada em interfaces,ou   *  seja, uma classe abstrata pode implementar ou n�o um m�todo.
  
*  Os m�todos abstratos definidos em uma classe abstrata devem obrigatoriamente ser implementados em uma classe concreta. Mas se uma classe   
*  abstrata herdar outra classe abstrata, a classe que herda n�o precisa implementar os m�todos abstratos.

*  Quando temos que definir vari�veis, constantes, regras, e pequenas a��es definidas devemos usar classes abstratas. Mas, se formos apenas    criar a forma como objetos devem realizar determinadas a��es (m�todos) devemos optar por interfaces.
*/

package classeAbstrata;

public abstract class Eletrodomestico {
	private boolean ligado;
	private int voltagem;

	// m�todos abstratos //
	/*
	 * n�o possuem corpo, da mesma forma que as assinaturas de m�todo de uma
	 * interface
	 */

	public abstract void ligar();

	public abstract void desligar();

	// m�todo construtor //
	/*
	 * Classes Abstratas tamb�m podem ter m�todos construtores, por�m, n�o podem
	 * ser usados para instanciar um objeto diretamente
	 */
	public Eletrodomestico(boolean ligado, int voltagem) {
		this.ligado = ligado;
		this.voltagem = voltagem;
	}

	// m�todos concretos
	/*
	 * Uma classe abstrata pode possuir m�todos n�o abstratos
	 */

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return this.voltagem;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isLigado() {
		return ligado;
	}

}

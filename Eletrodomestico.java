/* Uma classe abstrata serve como modelo para uma classe concreta.
*  
*  Não podem ser instanciadas com o new, elas sempre devem ser herdadas por classes concretas.
*  
*  As classes abstratas podem conter ou não métodos abstratos, que tem a mesma definição da assinatura de método encontrada em interfaces,ou   *  seja, uma classe abstrata pode implementar ou não um método.
  
*  Os métodos abstratos definidos em uma classe abstrata devem obrigatoriamente ser implementados em uma classe concreta. Mas se uma classe   
*  abstrata herdar outra classe abstrata, a classe que herda não precisa implementar os métodos abstratos.

*  Quando temos que definir variáveis, constantes, regras, e pequenas ações definidas devemos usar classes abstratas. Mas, se formos apenas    criar a forma como objetos devem realizar determinadas ações (métodos) devemos optar por interfaces.
*/

package classeAbstrata;

public abstract class Eletrodomestico {
	private boolean ligado;
	private int voltagem;

	// métodos abstratos //
	/*
	 * não possuem corpo, da mesma forma que as assinaturas de método de uma
	 * interface
	 */

	public abstract void ligar();

	public abstract void desligar();

	// método construtor //
	/*
	 * Classes Abstratas também podem ter métodos construtores, porém, não podem
	 * ser usados para instanciar um objeto diretamente
	 */
	public Eletrodomestico(boolean ligado, int voltagem) {
		this.ligado = ligado;
		this.voltagem = voltagem;
	}

	// métodos concretos
	/*
	 * Uma classe abstrata pode possuir métodos não abstratos
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

package br.com.projeto.calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece testes unitários para classe Calculadora, realizando
 * todas as operações listados na classe e realizando também os possiveis erros 
 * que podem ocorrer, assim, é possivel verificar o funcionamento correto dos metódos
 * e dos tratamento de erros observando a saida gerada .</p>
 *
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Técnicas de revisão estática (caixa branca)</li>
 *     <li>Técnicas de revisão (caixa branca)</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação com Javadoc</li>
 * </ul>
 *
 *
 * @author Rafael
 * @version 1.0
 */

public class TesteCalculadora {
	 /**
	 * Programa Principal
	 * 
	 */
	
	public static void main(String[] args) {
		 /**
		 * Chama a classe Calculadora nomeando de "calc"
		 * 
		 * Executa as operações da classe Calculadora através do "calc.calcular" e em seguida os parametros.
		 * 
		 *1.Soma ( @param 2, @param 3, @param + )
		 *2.Subtração ( @param 10, @param 4, @param - )
		 *3.Multiplicação ( @param 3, @param 5, @param * )
		 *4.Divisão( @param 8, @param 2, @param / )
		 *
		 *
		 */
		Calculadora calc = new Calculadora();

		System.out.println(calc.calcular(2, 3, "+"));
		System.out.println(calc.calcular(10, 4, "-"));
		System.out.println(calc.calcular(3, 5, "*"));
		System.out.println(calc.calcular(8, 2, "/"));

		 /**
		 * Teste das Exceções
		 *
		 * Tenta realizar operação de divisão com 0
		 * @throws IllegalArgumentException pois o @param b é igual a 0
		 * retorna a mensagem programada "Divisão por zero não é permitida".
		 *
		 */
		try {
			System.out.println(calc.calcular(8, 0, "/")); // exceção
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		 /**
		 * Teste das Exceções 2 
		 *
		 * Tenta realizar operação passando operador invalido
		 * @throws IllegalArgumentException pois o @param "x" não é valido
		 * retorna a mensagem programada ""Operador inválido: " + @param "x".
		 *
		 */

		try {
			System.out.println(calc.calcular(5, 5, "x")); // exceção
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

}
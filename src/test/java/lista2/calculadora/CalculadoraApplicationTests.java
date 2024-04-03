package lista2.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraApplicationTests {

	@Test
	@DisplayName("Testando construtor sem parametro inicializando a memória corretamente.")
	public void testarConstrutorSemParametroInicializaMemoriaCorretamente(){

		//Arrange: cenário de teste
		int resultadoMemoriaEsperado = 0;

		//Act: execução do método a ser testado
		Calculadora calculadora = new Calculadora();
		int resultadoMemoriaObtida = calculadora.getMemoria();

		//Assign: verificar os valores
		assertEquals(resultadoMemoriaEsperado, resultadoMemoriaObtida, "A memória está correta");
	}

	@Test
	@DisplayName("Testando o construtor com um parametro inicializando a memória corretamente.")
	public void testarConstrutorComUmParametroInicializaMemoriaCorretamente(){

		//Arrange: cenário de teste
		int valorEntradoParaMemoria = 3;
		int resultadoMemoriaEsperada = 3;

		//Act: execução do método a ser testado
		Calculadora calculadora = new Calculadora(valorEntradoParaMemoria);
		int resultadoMemoriaObtida = calculadora.getMemoria();

		//Assign: verificar os valores
		assertEquals(resultadoMemoriaEsperada, resultadoMemoriaObtida, "A memória está correta");
	}

	@Test
	@DisplayName("Testando método somar com números negativos")
	public void testarMetodoSomarComNumeroNegativos(){

		//Arrange: cenário de teste
		int valorEntradaParaMemoria = 6;
		int valorParaSerSomado = -10;
		int valorSomaEsperado = -4;

		//Act: execução do método a ser testado
		Calculadora calculadora = new Calculadora(valorEntradaParaMemoria);
		calculadora.somar(valorParaSerSomado);
		int resultadoSomaObtido = calculadora.getMemoria();

		//Assign: verificar os valores
		assertEquals(valorSomaEsperado, resultadoSomaObtido);
	}

	@Test
	@DisplayName("Testando método subtrair com números positivos")
	public void testarMetodoSubtrairComNumeroPositivo(){

		//Arrange: cenário de teste
		int valorEntradaParaMemoria = 20;
		int valorParaSerSubtraido = 4;
		int valorSubtraidoEsperado = 16;

		//Act: execução do método a ser testado
		Calculadora calculadora = new Calculadora(valorEntradaParaMemoria);
		calculadora.subtrair(valorParaSerSubtraido);
		int resultadoSubtrairObtido = calculadora.getMemoria();

		//Assign: verificar os valores
		assertEquals(valorSubtraidoEsperado, resultadoSubtrairObtido);
	}

	@Test
	@DisplayName("Testando método multiplicar com números positivos")
	public void testarMetodoMultiplicarComNumeroPositivo(){

		//Arrange: cenário de teste
		int valorEntradaParaMemoria = 20;
		int valorParaSerMultiplicado = 10;
		int valorMultiplicadoEsperado = 200;

		//Act: execução do método a ser testado
		Calculadora calculadora = new Calculadora(valorEntradaParaMemoria);
		calculadora.multiplicar(valorParaSerMultiplicado);
		int resultadoSubtrairObtido = calculadora.getMemoria();

		//Assign: verificar os valores
		assertEquals(valorMultiplicadoEsperado, resultadoSubtrairObtido);
	}

	@Test
	@DisplayName("Testando método dividir por zero")
	public void testarMetodoDividirPorZero(){

		// Arrange: cenário de teste
        int valorEntradaParaMemoria = 62;
        int valorDividido = 0;
        String erroDivisaoEsperado = "Divisão por zero!!!";
        String erroDivisaoObtido = "";

        // Act: execução do método a ser testado
        Calculadora calculadora = new Calculadora(valorEntradaParaMemoria);
        try {
            calculadora.dividir(valorDividido);
        } catch (Exception e) {
            erroDivisaoObtido = e.getMessage();
        }

        // Assert: verificar os valores
        assertEquals(erroDivisaoEsperado, erroDivisaoObtido);
	}

	@Test
	@DisplayName("Testando método dividir valores positivos")
	public void testarMetodoDividirValoresPositivos() throws Exception{

		// Arrange: cenário de teste
        int valorEntradaParaMemoria = 62;
        int valorDividido = 2;
        int valorDivisaoEsperado = 31;

        // Act: execução do método a ser testado
        Calculadora calculadora = new Calculadora(valorEntradaParaMemoria);
        calculadora.dividir(valorDividido);
		int resultadoDivisaoObtido = calculadora.getMemoria();
       

        // Assert: verificar os valores
        assertEquals(valorDivisaoEsperado, resultadoDivisaoObtido);
	}

	@Test
	@DisplayName("Testando método exponenciação por um")
	public void testarMetodoExponenciacaoPorUm(){

		// Arrange: cenário de teste
        int valorEntradaParaMemoria = 2;
        int valorExponenciacao = 1;
        int valorExponenciacaoEsperado = 2;

        // Act: execução do método a ser testado
		int resultadoExponenciacaoObtido = 0;
        Calculadora calculadora = new Calculadora(valorEntradaParaMemoria);
		try {
			calculadora.exponenciar(valorExponenciacao);
			resultadoExponenciacaoObtido = calculadora.getMemoria();
		} catch (Exception e) {
			e.getMessage();
		}
       
        // Assert: verificar os valores
        assertEquals(valorExponenciacaoEsperado, resultadoExponenciacaoObtido);
	}

	@Test
	@DisplayName("Testando método exponenciação por valor maior que dez")
	public void testarMetodoExponenciacaoPorMaiorDez(){

		// Arrange: cenário de teste
        int valorEntradaParaMemoria = 2;
        int valorExponenciacao = 12;
        String erroExponenciacaoEsperado = "Expoente incorreto, valor máximo é 10.";
		String erroExponenciacaoObtido = "";

        // Act: execução do método a ser testado
        Calculadora calculadora = new Calculadora(valorEntradaParaMemoria);
		try {
			calculadora.exponenciar(valorExponenciacao);
		} catch (Exception e) {
			erroExponenciacaoObtido = e.getMessage();
		}
       
        // Assert: verificar os valores
        assertEquals(erroExponenciacaoEsperado, erroExponenciacaoObtido);
	}

	@Test
	@DisplayName("Testando método zerar memória")
	public void testarMetodoZerarMemoria(){

		// Arrange: cenário de teste
        int valorEntradaParaMemoria = 26;
        int valorMemoriaEsperado = 0;

        // Act: execução do método a ser testado
        Calculadora calculadora = new Calculadora(valorEntradaParaMemoria);
        calculadora.zerarMemoria();
		int resultadoMemoriaObtido = calculadora.getMemoria();

        // Assert: verificar os valores
        assertEquals(valorMemoriaEsperado, resultadoMemoriaObtido);
	}
}

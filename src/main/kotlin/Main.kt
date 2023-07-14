import Util.VerificaInputs
import java.time.LocalDate
import java.time.format.DateTimeParseException

fun main() {
    while (true) {
        try {
            val processador = ProcessadorPagamentoImpl()
            println("Digite o valo do pagamento:")
            val valor = readln().toBigDecimal()
            println("Digite a data:")
            val data = LocalDate.parse(readln(), VerificaInputs.formatter)
            println("Você deseja pagar por  1-Cartão ou 2-Boleto:")
            val opcao = readln()

            when (opcao) {
                "1" -> {
                    println("Qual a bandeira do seu cartão:")
                    val cartao = readln()
                    val cartao1 = PagamentoCartao(valor, data, cartao)
                    processador.processarPagamento(cartao1)

                }

                "2" -> {
                    println("Qual o codigo de barras do boleto:")
                    val codigo = readln()
                    val boleto1 = PagamentoBoleto(valor, data, codigo)
                    processador.processarPagamento(boleto1)

                }

                else -> println("Opção invalida.")
            }
            println()
            println("Deseja realizar mais pagamentos?")
            println("1. Sim | 2. Não")
            val option = readlnOrNull()?.toIntOrNull()
            if (option != null && option == 2) {
                println("Finalizando...")
                return
            }
        } catch (erro: DateTimeParseException) {
            println("Data inválida")
        }
    }
}
import java.math.BigDecimal
import java.time.LocalDate

class PagamentoCartao(valor: BigDecimal, data: LocalDate, var bandeira :String) : Pagamento(valor, data) {
    override fun calcularDesconto(): BigDecimal {
        return valor.divide(BigDecimal("0.05"))
    }
}
import java.math.BigDecimal
import java.time.LocalDate

class PagamentoBoleto(valor: BigDecimal, data: LocalDate, val codigoBarras: String) : Pagamento(valor, data) {
    override fun calcularDesconto(): BigDecimal {
        return valor.divide(BigDecimal("0.1"))
    }
}
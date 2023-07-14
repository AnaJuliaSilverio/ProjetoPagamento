import java.math.BigDecimal
import java.time.LocalDate

abstract class Pagamento(var valor:BigDecimal,var data:LocalDate) {
    abstract fun calcularDesconto():BigDecimal
}
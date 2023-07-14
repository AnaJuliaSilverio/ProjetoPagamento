import Util.VerificaInputs

class ProcessadorPagamentoImpl: ProcessadorPagamento {
       override fun processarPagamento(pagamento: Pagamento) {
           val valorPagamento = pagamento.valor
           val desconto = pagamento.calcularDesconto()
           val valorFinal = pagamento.valor - desconto
           val data = pagamento.data.format(VerificaInputs.formatter)
           println("== NOTA FISCAL ==" +
                   "\nValor do pagamento: R$$valorPagamento"+
                   "\nValor do desconto: R$%.2f".format(desconto) +
                   "\nValor com desconto aplicado: R$%.2f".format(valorFinal) +
                   "\nData do pagamento $data")
       }

}





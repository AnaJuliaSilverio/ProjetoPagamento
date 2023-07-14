class ProcessadorPagamentoIML : ProcessadorPagamento {
       override  fun processarPagamento(pagamento: Pagamento){
            val desconto = pagamento.calcularDesconto()
            val  valorPagamentoEDesconto = pagamento.valor - desconto


           val notaFiscal= ("== NOTA FISCAL ==" +
                    "\nValor do desconto: $desconto" +
                    "\nValor do pagamento e desconto $valorPagamentoEDesconto" +
                    "\n Data do pagamento ${pagamento.data}")

    //       println(imprimirNotaFiscal(notaFiscal))

        }
//    fun imprimirNotaFiscal(nota: String) {
//        val larguraNota = nota.length
//
//        for (i in 0 until larguraNota + 4) {
//            print("─")
//        }
//        println()
//
//        println("│  $nota  │")
//
//        for (i in 0 until larguraNota + 4) {
//            print("─")
//        }
//        println()
//    }
}




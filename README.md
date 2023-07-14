# ProjetoPagamento

# Sistema de Pagamento 


# CLASSE ABSTRATA Pagamento e MÉTODO calcularDesconto( )
1° Foi criada a classe abstrata Pagamento com os parâmetros var valor tipo: BigDecimal e var data tipo:  String e o método abstrato calcularDesconto do tipo: BigDecimal


# CLASSE PagamentoBoleto
2° Em seguida foi criada a classe PagamentoBoleto, tendo como parâmetros herdados da classe Pagamento: valor e data e o atributo codigoDeBarras do tipo: String. Em seguida foi feita a sobrescrita do método calcularDesconto retornando o atributo valor multiplicando o valor de (“0.90”), com 10% de desconto.


# CLASSE PagamentoCartao
3° Em seguida foi criada a classe PagamentoCartao, tendo como parâmetros herdados da classe Pagamento: valor e data e o atributo bandeira do tipo: String. Em seguida foi feita a sobrescrita do método calcularDesconto retornando o atributo valor multiplicando o valor de (“0.95”), com 5% de desconto.


# INTERFACE ProcessadorPagamento
4° Em seguida foi criada a interface ProcessadorPagamento com o método processarPagamento 

# CLASSE concreta ProcessadorPagamentoImpl 
5º Em seguida foi a criada a classe ProcessadorPagamentoImpl tendo com instancia a inrface ProcessadorPagamento. 



package model;

import java.util.InputMismatchException;

public class ContaBancaria {

    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private Double VALOR_MINIMO_DEPOSITO = 10.0;

    //Construtor
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    //Métodos
    public void depositar(Double valor) {
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor mínimo para depósito é R$: " + VALOR_MINIMO_DEPOSITO);
        }
        this.saldo += valor;
    }

    public Double sacar(Double valor) {
        //Verifica se o valor do saque é maior que o saldo da conta.
        if (valor > this.saldo) {
            throw new InputMismatchException("Saldo insuficiente para o saque!");
        }
        this.saldo -= valor;
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino){
        //Efetua um saque na conta atual
        this.sacar(valor);
        //Efetua o depósito na conta de destino
        contaDestino.depositar(valor);

    }
}


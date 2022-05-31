package Conta;

import java.util.Objects;

public class ContaIndividual {

	private Long conta;
	private String nome = "Thiago";
	private double saldo = 0.00;
	private double deposito ;
	private double pagamento;
	public Long getConta() {
		return conta;
	}
	public void setConta(Long conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return (saldo =+ this.deposito) - getPagamento() ;
	}
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public double getPagamento() {
		return  pagamento;
	}
	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conta, deposito, nome, pagamento, saldo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaIndividual other = (ContaIndividual) obj;
		return Objects.equals(conta, other.conta)
				&& Double.doubleToLongBits(deposito) == Double.doubleToLongBits(other.deposito)
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(pagamento) == Double.doubleToLongBits(other.pagamento)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	
		}
	}
	
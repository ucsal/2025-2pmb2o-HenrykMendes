package br.com.mariojp.solid.ocp;

//Implementa a regra da interface e retorna o valor do desconto aplicado no valor bruto
public class PartnerPolicy implements DiscountPolicy{
	public double apply (double amount){
		return amount * 0.88;
	}
	
}

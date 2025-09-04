package br.com.mariojp.solid.ocp;

//Implementa a regra da interface e retorna o valor do desconto aplicado no valor total
public class RegularPolicy implements DiscountPolicy{
	public double apply (double amount) {
		return amount * 0.95;
	}
}

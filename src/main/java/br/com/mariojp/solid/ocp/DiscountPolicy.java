package br.com.mariojp.solid.ocp;

//Interface genérica  para implementar o desconto
public interface DiscountPolicy{
	double apply (double amount);
}
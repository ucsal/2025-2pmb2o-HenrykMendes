package br.com.mariojp.solid.ocp;
import java.util.*;

public class DiscountCalculator {
 Map<CustomerType, DiscountPolicy> DP = new HashMap<CustomerType, DiscountPolicy>();

 public DiscountCalculator(Map<CustomerType, DiscountPolicy> dP) {
	this.DP = dP;
 }
 	public DiscountCalculator() {
        DP.put(CustomerType.REGULAR, new RegularPolicy());
        DP.put(CustomerType.PREMIUM, new PremiumPolicy());
        DP.put(CustomerType.PARTNER, new PartnerPolicy());
}
	public double apply (double amount, CustomerType tipo) {
 		DiscountPolicy politica = DP.getOrDefault(tipo, a -> a);
 		return politica.apply(amount);
 	}
 	
 	
 
}

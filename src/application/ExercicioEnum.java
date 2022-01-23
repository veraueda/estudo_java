package application;

import java.util.Date;

import entities.NewOrder;
import entities.enums.OrderStatus;

public class ExercicioEnum {

	public static void main(String[] args) {
		
		NewOrder order = new NewOrder(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);

		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}

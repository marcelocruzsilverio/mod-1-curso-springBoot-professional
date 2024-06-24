package com.marcelocruz.exerciciomod1;

import com.marcelocruz.exerciciomod1.entities.Order;
import com.marcelocruz.exerciciomod1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exerciciomod1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Exerciciomod1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.0);
		double order1Total = orderService.total(order1);

		Order order2 = new Order(2282, 800.00, 10.0);
		double order2Total = orderService.total(order2);

		Order order3 = new Order(1309, 95.90, 0.0);
		double order3Total = orderService.total(order3);


		String formattedOrder = String.format("Pedido código %d\nValor total: R$ %.2f", order1.getCode(), order1Total);
		System.out.println(formattedOrder);

		formattedOrder = String.format("Pedido código %d\nValor total: R$ %.2f", order2.getCode(), order2Total);
		System.out.println(formattedOrder);

		formattedOrder = String.format("Pedido código %d\nValor total: R$ %.2f", order3.getCode(), order3Total);
		System.out.println(formattedOrder);

	}
}

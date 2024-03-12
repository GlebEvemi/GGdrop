package org.pago.ggdrop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class GgdropApplication {

	public static void main(String[] args) {
		SpringApplication.run(GgdropApplication.class, args);
	}

}

package org.pago.ggdrop;

import org.pago.ggdrop.entity.User;
import org.pago.ggdrop.repository.CaseRepository;
import org.pago.ggdrop.repository.ItemRepository;
import org.pago.ggdrop.repository.TradeRepository;
import org.pago.ggdrop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import java.util.List;

@SpringBootApplication
@Controller
public class GgdropApplication implements CommandLineRunner {

	@Autowired
	private CaseRepository caseRepository;
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private TradeRepository tradeRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(GgdropApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//userRepository.save(new User("gleb2466@gmail.com", "1234","Gleb", "Pusin"));
		/*userRepository.save(new User("gleb2466@gmail.com", "1234", "Gleb", "Pusin"));
		userRepository.save(new User("denis322@gmail.com", "6789", "Denis", "Dunaev"));
		userRepository.save(new User("artur666@gmail.com", "6666", "Artur", "Panitšev"));
		List<User> list = userRepository.findAll();
		for(User user: list){
			System.out.println(user.getFirstName() + " "+ user.getLastName());
		}*/
	}
}

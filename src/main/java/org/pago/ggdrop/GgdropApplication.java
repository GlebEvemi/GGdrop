package org.pago.ggdrop;

import org.pago.ggdrop.entity.Case;
import org.pago.ggdrop.entity.Item;
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
		/*
		caseRepository.save(new Case("Snakebite Case", "/assets/img/cases/snakebite/case.png", 1));


		itemRepository.save(new Item("UMP-45 | Осциллятор","/assets/img/cases/snakebite/1.png",  0.40F));
		itemRepository.save(new Item("SG 553 | Тяжёлый метал","/assets/img/cases/snakebite/2.png",  0.44F));
		itemRepository.save(new Item("Револьвер R8 | Автосвалка","/assets/img/cases/snakebite/3.png",  0.52F));
		itemRepository.save(new Item("Nova | На крыльях ветра","/assets/img/cases/snakebite/4.png",  0.41F));
		itemRepository.save(new Item("M249 | O.S.I.P.R.","/assets/img/cases/snakebite/5.png",  0.41F));
		itemRepository.save(new Item("Glock-18 | Прозрачный полимер","/assets/img/cases/snakebite/6.png",  0.66F));
		itemRepository.save(new Item("CZ75-Auto | Настоящий змееяд","/assets/img/cases/snakebite/7.png",  0.45F));
		itemRepository.save(new Item("P250 | Киберпанцирь","/assets/img/cases/snakebite/8.png",  1.63F));
		itemRepository.save(new Item("Negev | dev_texture","/assets/img/cases/snakebite/9.png",  1.56F));
		itemRepository.save(new Item("MAC-10 | Кнопкодав","/assets/img/cases/snakebite/10.png",  1.61F));
		itemRepository.save(new Item("Desert Eagle | Стрелковая дисциплина","/assets/img/cases/snakebite/11.png",  3.99F));
		itemRepository.save(new Item("AK-47 | Сланец","/assets/img/cases/snakebite/12.png",  13.26F));
		itemRepository.save(new Item("XM1014 | Целую-обнимаю","/assets/img/cases/snakebite/13.png",  10.00F));
		itemRepository.save(new Item("MP9 | Пищевая цепь","/assets/img/cases/snakebite/14.png",  10.97F));
		itemRepository.save(new Item("Galil AR | Хроматическая аберрация","/assets/img/cases/snakebite/15.png",  12.55F));
		itemRepository.save(new Item("USP-S | Предатель","/assets/img/cases/snakebite/16.png",  76.99F));
		itemRepository.save(new Item("M4A4 | В живом цвете","/assets/img/cases/snakebite/17.png",  47.09F));
		itemRepository.save(new Item("Обмотки рук | Удав","/assets/img/cases/gloves/20.png",  130.11F));
		*/
	}
}

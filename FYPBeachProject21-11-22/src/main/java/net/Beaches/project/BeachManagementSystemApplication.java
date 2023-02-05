package net.Beaches.project;


// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
// import net.Beaches.project.repository.BeachRepository;
// import net.Beaches.project.repository.LifeguardRepository;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class BeachManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BeachManagementSystemApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
    return new RestTemplate();
}

	// @Autowired
	// private BeachRepository BeachRepository;
	// @Autowired
	// private LifeguardRepository LifeguardRepository;


	@Override
	public void run(String... args) throws Exception {


		//command line to insert some values into DB
		
		// Lifeguard lifeguard1 = new Lifeguard("Michael", "Duxbury", "Level 6");
		// LifeguardRepository.save(lifeguard1);
		
		//   Beach Beach1 = new Beach("Garretstown", "Kinsale", "Cork", "https://i.pinimg.com/originals/66/91/3e/66913ec67729103e9d35a2a68817cacc.jpg", true, true, true, false, false, true, true, false);
		//   BeachRepository.save(Beach1);
		  
		//   Beach Beach2 = new Beach("Garrylucas", "Kinsale", "Cork", "https://www.thebeachguide.co.uk/public/geophotos/558220.jpg", true, true, true ,false , false, false, true, false);
		//   BeachRepository.save(Beach2);
		 
		//   Beach Beach3 = new Beach("Inchydoney", "Clonakilty", "Cork", "https://aux.iconspalace.com/uploads/beach-icon-256.png", true, true , false, false, false, false, false, false);
		//   BeachRepository.save(Beach3);
		
			


	}

}

package com.sola.ProjetoTarget;

import com.sola.ProjetoTarget.service.DesafiosService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@AllArgsConstructor
@SpringBootApplication
public class ProjetoTargetApplication implements CommandLineRunner {
	private final DesafiosService desafiosService;
	public static void main(String[] args) {
		SpringApplication.run(ProjetoTargetApplication.class, args);
	}


	@Override
	public void run(String... args){
		log.info("");
		log.info("##### EXERCICIO 1 #####");
		log.info("Soma: {}", desafiosService.exercicio1());
		log.info("");

		log.info("");
		log.info("##### EXERCICIO 2 #####");
		log.info("FIBONACCI: {}",desafiosService.fibonacci(144));
		log.info("");

		log.info("##### EXERCICIO 3 - A #####");
		log.info("O proximo numero da sequencia 1,3,5,7 é {}", desafiosService.valoresImpares(7));
		log.info("");
		log.info("##### EXERCICIO 3 - B #####");
		log.info("O proximo numero da sequencia 2,4,8,16,32,64 é {}", desafiosService.multiplosDeDois(64));
		log.info("");
		log.info("##### EXERCICIO 3 - C #####");
		log.info("O proximo numero da sequencia 0,1,4,9,16,25,36 é {}", desafiosService.quadradoPerfeito(36));
		log.info("");
		log.info("##### EXERCICIO 3 - D #####");
		log.info("O proximo numero da sequencia 4,16,36,64 é {}", desafiosService.sequenciaQuadradoPares(64));
		log.info("");
		log.info("##### EXERCICIO 3 - E #####");
		log.info("O proximo numero da sequencia 1,1,2,3,5,8 é {}", desafiosService.sequenciaFibonacci(8));
		log.info("");
		log.info("##### EXERCICIO 3 - F #####");
		log.info("O proximo numero da sequencia 2,10,12,16,17,18,19 é {}", desafiosService.sequenciaNumeroIniadosComD(19));
		log.info("");
		log.info("##### EXERCICIO 4 #####");
		log.info("Resposta: {}",desafiosService.equacaoHoraria());
		log.info("");
		log.info("##### EXERCICIO 5 #####");
		log.info("Inverter String: {}",desafiosService.inverterString("Projeto Target"));

	}
}


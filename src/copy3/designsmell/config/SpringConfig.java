package copy3.designsmell.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import copy3.designsmell.Scanner;
import copy3.designsmell.Database;
import copy3.designsmell.FileSystem;
import copy3.designsmell.InputData;
import copy3.designsmell.Keyboard;
import copy3.designsmell.OutputData;
import copy3.designsmell.Printer;

@Configuration
public class SpringConfig {
	
	@Bean
	public OutputData printer() {
		return new Printer();
	}
	
	
	@Bean
	public OutputData database() {
		return new Database();
	}
	
	@Bean
	public OutputData filesystem() {
		return new FileSystem();
	}
	
	@Bean
	public InputData keyboard() {
		return new Keyboard();
	}
	
	@Bean
	public InputData scanner() {
		return new Scanner();
	}

}

package copy3.designsmell;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import copy3.designsmell.config.SpringConfig;


public class Client {

	public static void main(String[] args) throws Exception {
		
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
			//Service service = context.getBean(Service.class);
		
		OutputData printer = new Printer();
		OutputData database = new Database();
		
		InputData Keyboard = new Keyboard();
		
		InputData scanner = new Scanner();
		
		// 
		Copier copyFronKeyword = new Copier(printer);
		copyFronKeyword.copy(Keyboard);
		
		Copier copyFronScanner = new Copier(database);
		
	
		copyFronScanner.copy(scanner);
	}

}
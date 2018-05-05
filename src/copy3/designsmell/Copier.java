package copy3.designsmell;

public class Copier {
	
	private OutputData outputData; 
	
	
	
	public Copier(OutputData outputData) {
		this.outputData = outputData;
	}


	public void copy(InputData inputData) throws Exception {
		String inputValue = inputData.read();
		
		
		while (!(inputValue.equals("-1"))) {
			
			outputData.write(inputValue);
			
		}
	}
}
package copy3.designsmell;

import common.Util;

public class Printer  implements OutputData {

	public void write(String value) {
		Util.output(" *Printer: " + value);
	}

}
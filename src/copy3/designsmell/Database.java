package copy3.designsmell;

import common.Util;

public class Database implements OutputData {

	public void write(String value) {
		Util.output(" *Database: " + value);
	}

}
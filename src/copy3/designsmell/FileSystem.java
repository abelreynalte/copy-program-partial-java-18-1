package copy3.designsmell;

import common.Util;

public class FileSystem implements OutputData {

	public void write(String value) {
		Util.output(" *FileSystem: " + value);
	}

}
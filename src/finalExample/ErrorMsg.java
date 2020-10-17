package finalExample;

public class ErrorMsg {
	final static int OUTER = 0;
	final static  int INERR = 1;
	final static int DISKERR = 2;
	final static int INDEXERR = 3;
	
	String msgs[] = {
			"Output Error",
			"Input Error",
			"Disk Full",
			"Index Out-Of-Bounds"
	};
	//return the error message
	String getErrorMsg(int i) {
		if (i >=0 & i < msgs.length) {
			return msgs[i];
		}
		else {
			return "Invalid Error Code";
		}
	}
}

package finalExample;

public class FinalD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(ErrorMsg.OUTER));
		System.out.println(err.getErrorMsg(ErrorMsg.DISKERR));
		System.out.println(err.getErrorMsg(ErrorMsg.INDEXERR));
	}

}

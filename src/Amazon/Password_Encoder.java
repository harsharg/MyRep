package Amazon;

public class Password_Encoder {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		byte[] encodedBytes = Base64.encodeBase64("TextforEncoding".getBytes());
		System.out.println("encodedBytes " + new String(encodedBytes));

	}

}

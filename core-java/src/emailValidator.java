public class emailValidator {
		public static void main(String[] args)
		{
			String s="polkamshiva@gmail.com";
			int a1=(s.indexOf("@"));
			int a2=(s.lastIndexOf("@"));
			int b1=(s.indexOf("."));
			int b2=(s.lastIndexOf("."));
			int c1=b1-a1;
			int c2=s.length()-b1;
			if(a1==a2 && b1==b2 && a1>=3 && c1>=4 &&c2>2)
			{
					System.out.println("valid Mail id");			
				}
				else
				{
					System.out.println("Invalid Mail id");
				}
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(c1);
			System.out.println(c2);
		}
	}


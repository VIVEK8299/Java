class p36
{ public static void main(String A[])
	{ String s="box",s2="buy",s3="Box";
	  String a="BOOKS",a1="booKs";
	  System.out.print("String Comparison");
	  System.out.println(s.compareTo(s2));
	  System.out.println(s.compareTo(s3));
	  System.out.println(s.compareToIgnoreCase(s3));
	  System.out.println("\n");
	  System.out.println("String Equals:");
	  System.out.println(s.equals(s3));
	  System.out.println(s.equalsIgnoreCase(s3));
	}
}
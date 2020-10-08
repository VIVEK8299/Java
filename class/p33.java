class p33
{ public static void main(String A[])
	{ char ch[]={'0','0','0','1','0','0','0','1','\0'};
 	  int a=0;
	  
	  while(ch[a]!='\0')
		{ char c=ch[a];
		  switch(c)
			{ case '0':System.out.print("Zero ");
				   break;
			  case '1':System.out.print("One ");
				   break;
			  default:System.out.print("Invalid");
			}
		 a++;
		}
	}
}	
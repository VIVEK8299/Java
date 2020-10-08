class p27
{
 public static void main(String[]R)
 {
  int i,j,row,col,count=2;
  row =Integer.parseInt(R[0]);
  col=Integer.parseInt(R[1]);

  int a[][]=new int[row][col];
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    a[i][j]=Integer.parseInt(R[count]);
    count++;
   }
  }
  System.out.println("the Given Matrix is:");
  for(i=0;i<row;i++)
  {
   for(j=0;j<col;j++)
   {
    System.out.print("["+a[i][j]+"]");
   }
   System.out.println();
  }
 }
}
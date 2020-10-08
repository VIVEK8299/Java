class p28
{
 public static void main(String[]R)
 {
  int row =Integer.parseInt(R[0]);
  int col =Integer.parseInt(R[1]);
  int count = 2;
  int arr[][]=new int[row][col];
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    arr[i][j]=Integer.parseInt(R[count]);
    count++;
   }
  }
  System.out.println("original array is:");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    System.out.print("["+arr[i][j]+"]");
   }
   System.out.println();
  }
  System.out.println("Transpose of above array is");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    System.out.print("["+arr[j][i]+"]");
   }
   System.out.println();
  }
 }
}
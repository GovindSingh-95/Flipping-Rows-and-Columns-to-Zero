public class Set_matrix_to_zero_method_3{
    public static void main(String[] args){
        int[][] arr={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int row=arr.length;
        int column=arr[0].length;
        boolean rowZero=false;
        boolean columnZero=true;
        for(int i=0;i<row;i++)if(arr[i][0]==0)rowZero=true;
        for(int j=0;j<column;j++)if(arr[0][j]==0)columnZero=true;
        System.out.println("Initial Matrix:");
        for(int[] ele:arr){
            for(int x:ele) System.out.print(x+" ");
            System.out.println();}
        for(int i=1;i<row;i++){
         for(int j=1;j<column;j++){
          if(arr[i][j]==0){
             arr[i][0]=0;
             arr[0][j]=0;
          }
         }}
    for(int i=1;i<row;i++){
      if(arr[i][0]==0){
        for(int j=1;j<column;j++)arr[i][j]=0;}
    }
    for(int j=1;j<column;j++){
      if(arr[0][j]==0){
       for(int i=1;i<row;i++)arr[i][j]=0;}
    }
    if(columnZero==true)for(int j=0;j<column;j++)arr[0][j]=0;
    if(columnZero==true)for(int i=0;i<row;i++)arr[i][0]=0;
        System.out.println("Final Matrix: ");
    for(int[] ele:arr){
     for(int x:ele) System.out.print(x+" ");
        System.out.println();}
    }
}

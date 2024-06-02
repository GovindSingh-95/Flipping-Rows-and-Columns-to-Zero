# Flipping-Rows-and-Columns-to-Zero
<br>
<h2>Question statement</h2>
Consider a Matrix of m x n order,if an element in that matrix is zero,then set the elements of rows and columns associated with that zero to zero for example:<br>
![mat1](https://github.com/GovindSingh-95/Flipping-Rows-and-Columns-to-Zero/assets/156602160/1685d6c9-6c0c-43e5-a594-d7de77a6d8d5)
<br>Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]<br>
    Output: [[1,0,1],[0,0,0],[1,0,1]]
<br>
<h2>Algorthim </h2>
<p>  Initially consider row=number of rows and column=number of columns.<br>
 <br>Now take 2 boolean variables checkRow and checkColumn.Traverse in the first row and if there is 0 ,
     make checkRow=true,do same for checkColumn varible also.<br>
 <br>With help of nested loop and traverse in decreased matrix of order (m-1)x(n-1),if here you encounter 0,
     make the element of that particular value column and row in first row and first column to zero.<br>
<br>After marking the required rows and coumns for changing to 0,Traverse in first row and check which element is zero,<br>
    if,it is zero then,for that particular value of row, change that whole column to zero using for loop.<br>
<br>Similarly,traverse in the first column and check which element is zero,<br>
    if,it is zero then,for that particular value of column, change that whole row to zero using for loop.<br>
<br>Now check out of checkRow and checkColumn which value is true,if any of the value is true traverse in it and set all the terms in it to 0   
</p>
<br>
<h2>The Code is in the Src File</h2>

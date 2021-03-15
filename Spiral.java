public class Spiral {
  public static int[] spiralOrder(int[][] arr) {
      int[] result = new int[arr.length*arr[0].length];

    int rows = arr.length;
    int cols = arr[0].length;
  // Defining the boundaries of the matrix.
  int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
  
  // Defining the direction in which the array is to be traversed.
  int dir = 1;
  int count = 0;
 
  while (top <= bottom && left <= right) {

    if (dir == 1) {    // moving left->right
      for (int i = left; i <= right; ++i) {
        result[count]=arr[top][i];
        count++;
      }
      // Since we have traversed the whole first
      // row, move down to the next row.
      ++top;
      dir = 2;
    } 
    else if (dir == 2) {     // moving top->bottom
      for (int i = top; i <= bottom; ++i) {
        result[count]=arr[i][right];
        count++;
      }
      // Since we have traversed the whole last
      // column, move left to the previous column.
      --right;
      dir = 3;
    } 
    else if (dir == 3) {     // moving right->left
      for (int i = right; i >= left; --i) {
        result[count]=arr[bottom][i];
        count++;
      }
      // Since we have traversed the whole last
      // row, move up to the previous row.
      --bottom;
      dir = 4;
    } 
    else if (dir == 4) {     // moving bottom->up
      for (int i = bottom; i >= top; --i) {
        result[count]=arr[i][left];
        count++;
      }
      // Since we have traversed the whole first
      // col, move right to the next column.
      ++left;
      dir = 1;
    }
  }  
  return result; 
}
  public static void main(String[] args) 
  { 
    // Driver code
    // Change the following array to test 
    // on some other input
    int a[][] = { {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
    int b[] =spiralOrder(a);
    for(int num:b){
        System.out.println(num);

    }
  } 
}
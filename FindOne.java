import java.util.*;
class FindOne
{
static int r=2;
static int c=2;

static int rowMax1s(int mat[][], int r, int c)
{
  boolean flag = true;
  int maxindex = 0, maxones = 0,count = 0 ;;
  for(int i = 0 ; i < c ; i++)
  {
            for(int j = 0 ; j < c ; j++){
                if(mat[i][j] == 1){
                    count++;
                    flag = false;
                }
            }
            if(count>maxones){
                maxones = count;
                maxindex = i;
            }
 
    }
    if(flag){
            return -1;
        }
 
    return maxindex;
  
}
public static void main(String[] args)
{
   int mat[][]={ {0, 1},
                 {1, 1},
      
              };
   
  System.out.println("Index of row which have maximum 1s is " + rowMax1s(mat,r,c));
}
}
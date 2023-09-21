import java.util.Arrays;

public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int i = 0; i < chessboard.length; i++){
         for (int j = 0; j < chessboard[i].length; j++){
            if ((i + j) % 2 == 0) {
               chessboard[i][j] = '\u25A1';
            }
            else {chessboard[i][j] = '\u25A0';}
         }
      }
      for (char row[]: chessboard) {
         for (char square: row) {
            System.out.print(square);
         }
         System.out.println();
      }
   }
}
package Diziler;

public class HarfYazdirma {
    public static void main(String[] args) {
        String[][] letter = new String[5][4];
        // B harfi yazdıran program.

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 && j != 3) {
                    letter[i][j] = " * ";
                }
                else if (i == 2 && j != 3) {
                    letter[i][j] = " * ";
                }
                else if (i == 4 && j != 3) {
                    letter[i][j] = " * ";
                }
                else if (j == 0){
                    letter[i][j] = " * ";
                }
                else if (j == 3 && i == 1) {
                    letter[i][j] = "* ";
                }
                else if (j == 3 && i == 3)  {
                    letter[i][j] = "* ";
                }
                else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

package MayinTarlasi;
import java.util.Random;
import java.util.Scanner;
public class Game {
    int row;
    int col;
    String[][] MineMap;
    String[][] GameMap;
    int mine;
    int r; // Kullanıcıdan alınacak row değeri
    int c; // Kullanıcıdan alınacak column değeri
    int count;
    boolean isTrue = false;

    public Game(int row, int col){ //Construction method
        this.row = row;
        this.col = col;
        this.GameMap = new String[row][col];
        this.MineMap = new String[row][col];
        this.mine = (row * col)/4;
    }

    void MineMap(){
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                MineMap[i][j] = "-";
                GameMap[i][j] = "-";
            }
        }
    }

    void randomNumber(){
        Random random = new Random();
        for (int i=0; i < this.mine; i++){
            int rnum = random.nextInt(this.row);
            int rnum2 = random.nextInt(this.col);
            if (!this.MineMap[rnum][rnum2].equals("*")){
                this.MineMap[rnum][rnum2] = "*";
            }
        }
    }

    void printMineMap(){
        randomNumber();
        for (int i=0; i<this.row; i++){
            for (int j =0; j<this.col; j++){
                if (!this.MineMap[i][j].equals("*")){
                    this.MineMap[i][j]="-";
                }
            }
        }
    }
    /* void printGameMap(){
        for (int i=0; i<this.row; i++){
            for (int j=0; j<this.col; j++){
                this.GameMap[i][j] = "-";
                System.out.println(this.GameMap[i][j] + " ");
            }
            System.out.println();
        }
    } */

    void control(){
        count = 0;
        for (int i= (r-1); i<= (r+1); i++){
            for (int j= (c-1); j<= (c+1); j++){
                if (i<0 || j<0 || i>=this.row || j>=this.col){
                    continue;
                }
                if (this.MineMap[i][j].equals("*")){
                    count++;
                }
            }
        }
        this.GameMap[r][c] = String.valueOf(count);
        this.MineMap[r][c] = String.valueOf(count);
        for (int i=0; i < this.row; i++){
            for (int j=0; j < this.col; j++){
                System.out.print(this.GameMap[i][j]+ " ");
            }
            System.out.println();
        }
    }

    boolean finish(){
        for (int i=0; i<this.row; i++){
            for (int j=0; j<this.col; j++){
                if (this.MineMap[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

    void chooseIndex(){
        Scanner input = new Scanner(System.in);
        isTrue = false;
        while(!isTrue){
            System.out.print("Satır numarasını giriniz: ");
            r = input.nextInt();
            if (r>row){
                System.out.println("Oyunun sınırları dışında bir değer girdiniz!");
                continue;
            }

            System.out.print("Sütun numarasını giriniz: ");
            c = input.nextInt();
            if (c>col){
                System.out.println("Oyunun sınırları dışında bir değer girdiniz!");
                continue;
            }

            r -= 1;
            c -= 1;

            /*if (r>row || c>col){
                System.out.println("Oyunun sınırları dışında bir değer girdiniz!");
                continue;
            }*/
            if (MineMap[r][c].equals("*")){
                System.out.println("Game Over!");
                break;
            }
            control();
            if (finish()){
                System.out.println("Tebrikler! Kazandınız.");
                break;
            }
        }
    }

    public void run(){
        MineMap();
        printMineMap();
        chooseIndex();
    }
}

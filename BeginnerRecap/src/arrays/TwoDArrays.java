package arrays;

public class TwoDArrays {
    void loadTwoDimensional(){
        int[][] table = new int[3][4];

        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                table[i][j] = (i * 4) + j + 1;
                System.out.print(table[i][j] + "|");
            }

            System.out.println();
        }
    }
}

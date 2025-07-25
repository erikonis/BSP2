public class Maze {
    Cell[][] cellArray= new Cell[5][5];


    public void fillWalls(Cell[][] cellArray) {
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
            if(x!=0)
                if(cellArray[x-1][y].wallright)
                    cellArray[x][y].wallLeft=true;
            if(x!=4)
                if(cellArray[x+1][y].wallLeft)
                    cellArray[x][y].wallright=true;
            if(y!=4)
                if(cellArray[x][y+1].wallUp)
                    cellArray[x][y].walldown=true;
            if(y!=0)
                if(cellArray[x][y-1].walldown)
                    cellArray[x][y].wallUp=true;
            }
        }
    }


    public void updateMaze(){
        for(int y=0;y<5;y++){
            for(int x=0;x<5;x++)
                System.out.print(cellArray[x][y].lineTop());
            System.out.println();
            for(int x=0;x<5;x++)
                System.out.print(cellArray[x][y].lineMid());
            System.out.println();
            for(int x=0;x<5;x++)
                System.out.print(cellArray[x][y].lineBottom());
            System.out.println();
        }
    }

    public void createMaze() {
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                cellArray[i][j]=new Cell(false, false, false, false, " ");
                if(i==0){
                    cellArray[i][j].wallLeft=true;
                }
                if(i==4){
                    cellArray[i][j].wallright=true;
                }
                if(j==0){
                    cellArray[i][j].wallUp=true;
                }
                if(j==4){
                    cellArray[i][j].walldown=true;
                }
            }
        }
        cellArray[3][0].element="S"; //start point
        cellArray[2][4].element="E"; //endpoint

        cellArray[4][0].element="ค"; //ก or ค or ¤ ALien
        cellArray[1][0].element="*"; //stone
        cellArray[1][4].element="*";

        cellArray[3][0].wallright=true;
        cellArray[2][0].wallLeft=true;
        
        cellArray[3][1].walldown=true;
        cellArray[3][1].wallLeft=true;
        cellArray[2][1].walldown=true;
        cellArray[1][1].wallUp=true;
        cellArray[0][1].walldown=true;
        cellArray[0][3].wallright=true;
        cellArray[1][4].wallUp=true;
        cellArray[1][4].wallright=true;
        cellArray[2][3].walldown=true;
        cellArray[2][3].wallright=true;
        cellArray[3][2].wallright=true;
        cellArray[3][3].walldown=true;
        cellArray[4][3].wallUp=true;


        fillWalls(cellArray);
        
    }
}

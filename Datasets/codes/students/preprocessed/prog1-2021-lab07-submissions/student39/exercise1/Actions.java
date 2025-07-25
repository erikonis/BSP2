public abstract class Actions {

    public abstract void move(int[] direction, String dir);
    public abstract void takeRock();
    public abstract void takePhoto(boolean highRes);

    private static int max_x = 99;
    private static int max_y = 99;
    
    public boolean collision(int[] direction, int x, int y, int advance) {
        boolean collision = false; 
        int next_x = x;
        int next_y = y;
        
        //looks for all points in next movement if any in between 
        for (int i = 0; i < advance && !collision; i++) {
            
            //walls around the maze
            if ( next_x < 0 || next_y < 0 || next_x > max_x || next_y > max_y ) {
                collision = true;
            } 
            //walls inside the maze
            //if wall in between position and next position
            //vertcial walls
            else if ( next_y <= 19 && next_x == 80 || 20 <= next_y && next_y <= 39 && next_x == 20 || 60 <= next_y && next_y <= 79 && next_x == 60 || next_y >= 80 && ( next_x == 20 || next_x == 60 || next_x == 80) ) {
                collision = true;
            }
            //horizontal walls
            else if ( 20 <= next_x && next_x <= 79 && next_y == 20 || 40 <= next_x && next_y == 40 || ( ( 20 <= next_x && next_x <= 59 ) || next_x >= 80 ) && next_y == 60 ||  20 <= next_x && next_x <= 39 && next_y == 80 ) {
                collision = true;
            }
            next_x += direction[0];
            next_y += direction[1];
        }
       
        return collision;

    }

    public boolean hasRock(int x, int y) {
        boolean hasRock = false;

        if ( x <= 19 && 20 <= y && y <= 39) {
            hasRock = true;
        }
        return hasRock;    
    }

    public byte atAlien(int x, int y) {
        // 0 means no alien, 1 in front of alien, 2 case of alien

        //in front of alien
        if ( x <= 19 && 60 <= y && y <= 79) {
            return 1;
        
        //the alien's case
        } else if ( x <= 19 && y >= 80) {
            return 2;

        //no alien
        } else {
            return 0;
        }
    }

    public int getMax_x() {
        return max_x;
    }

    public static int getMax_y() {
        return max_y;
    }



}

public class Controller extends Action {
    public String[][] field = new String[5][5];
    private int row = 0, column = 3, counter = 0;
    private Robot r = new Robot();

    public Controller() {
        field[3][0] = "Alien";
        field[1][0] = "Stone";
    }

    @Override
    public String moveUp() {
        if (row - 1 >= 0 && r.getFuel() >= 10 && counter < 10) {
            row--;
            counter++;
            r.setfuel(r.getFuel() - 10);
            return "The robot moved up and consumed 10 seconds from his battery!\nNew battery amount: " + r.getFuel()
                    + getText();
        } else {
            return "You can't move in that direction!";
        }
    }

    @Override
    public String moveDown() {
        if (row + 1 < field.length && r.getFuel() >= 10 && counter < 10) {
            row++;
            counter++;
            r.setfuel(r.getFuel() - 10);
            return "The robot moved down and consumed 10 seconds from his battery!\nNew battery amount: " + r.getFuel()
                    + getText();
        } else {
            return "You can't move in that direction!";
        }
    }

    @Override
    public String moveLeft() {
        if (column - 1 >= 0 && r.getFuel() >= 10 && counter < 10) {
            column--;
            counter++;
            r.setfuel(r.getFuel() - 10);
            return "The robot moved to the left and consumed 10 seconds from his battery!\nNew battery amount: "
                    + r.getFuel() + getText();
        } else {
            return "You can't move in that direction!";
        }
    }

    @Override
    public String moveRight() {
        if (column + 1 < field[row].length && r.getFuel() >= 10 && counter < 10) {
            column++;
            counter++;
            r.setfuel(r.getFuel() - 10);
            return "The robot moved to the right and consumed 10 seconds from his battery!\nNew battery amount: "
                    + r.getFuel() + getText();
        } else {
            return "You can't move in that direction!";
        }
    }

    public String pickRock() {
        if (field[row][column] != null && field[row][column].equals("Stone") && r.getFuel() >= 150 && counter < 10) {
            r.setfuel(r.getFuel() - 150);
            return "The robot used 150 seconds of his battery to pick up some rocks.\nNew battery amount: "
                    + r.getFuel();
        } else {
            return "";
        }
    }

    public String takeHDPicture() {
        if (field[row][column] != null && field[row][column].equals("Alien") && r.getFuel() >= 60 && counter < 10) {
            r.setfuel(r.getFuel() - 60);
            return "The robot used 60 seconds of his battery to make a high resolution picture of an alien.\nNew battery amount: "
                    + r.getFuel();
        } else {
            return "";
        }
    }

    public String takeLDPicture() {
        if (field[row][column] != null && field[row][column].equals("Alien") && r.getFuel() >= 40 && counter < 10) {
            r.setfuel(r.getFuel() - 40);
            return "The robot used 40 seconds of his battery to make a high resolution picture of an alien.\nNew battery amount: "
                    + r.getFuel();
        } else {
            return "";
        }
    }

    private String checkIfEnd() {
        if (row == 4 && column == 1) {
            return "The robot reached the end.";
        } else {
            return "";
        }
    }

    private String getText() {
        String text = "";
        if (!pickRock().equals("")) {
            text += pickRock();
        }
        if (!takeHDPicture().equals("")) {
            text += takeHDPicture();
        }
        if (!checkIfEnd().equals("")) {
            text += checkIfEnd();
        }
        return "\n" + text + "\n";
    }
}

package university;

public class Room {
    private int number, seats;
    private boolean whiteBoard, smartBoard, blackBoard, computers;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean hasWhiteBoard() {
        return whiteBoard;
    }

    public void setWhiteBoard(boolean whiteBoard) {
        this.whiteBoard = whiteBoard;
    }

    public boolean hasSmartBoard() {
        return smartBoard;
    }

    public void setSmartBoard(boolean smartBoard) {
        this.smartBoard = smartBoard;
    }

    public boolean hasBlackBoard() {
        return blackBoard;
    }

    public void setBlackBoard(boolean blackBoard) {
        this.blackBoard = blackBoard;
    }

    public boolean hasComputers() {
        return computers;
    }

    public void setComputers(boolean computers) {
        this.computers = computers;
    }
}

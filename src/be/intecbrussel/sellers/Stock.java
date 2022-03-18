package be.intecbrussel.sellers;

public abstract class Stock {

    private int iceRockets;
    private int cones;
    private int balls;
    private int magnum;


    public Stock(int iceRockets, int cones, int balls, int magnum) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magnum = magnum;
    }

    public Stock() {

    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }


    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getCones() {
        return cones;

    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getBalls() {
        return balls;
    }


    public void setMagnum(int magnum) {
        this.magnum = magnum;
    }

    public int getMagnum() {
        return magnum;

    }

public boolean inStock(){
        return true;
}

}
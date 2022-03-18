package be.intecbrussel.eatables;


public class Magnum implements Eatable {

    private MagnumType type;

    public Magnum() {

    }


    public Magnum(MagnumType type) {
        this.type = type;
    }

    public void setType(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }




    @Override
    public void eat() {
        System.out.println("She is eating " + type);

    }

    @Override
    public String toString() {
        return "Magnum{" +
                "type=" + type +
                '}';
    }
}



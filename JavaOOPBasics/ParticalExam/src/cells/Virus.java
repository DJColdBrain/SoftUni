package cells;

public class Virus extends Microbe{
    public Virus(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }

    protected int getEnergy(){
        return (getHealth() + getVirulence()) ;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\n--------Health: "+ getHealth() +" | Virulence: "+ getVirulence() +" | Energy: " + getEnergy() ;
    }
}

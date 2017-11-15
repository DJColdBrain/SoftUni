package vehiclesExtension;

public class Bus extends Vehicle {



    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumption(fuelConsumption);
        setTankCapacity(tankCapacity);
    }



    @Override
    protected double calculateFuelAmmount(double ammount) {
        return ammount;
    }

    @Override
    protected double calculateFuelCunsuption() {
        if (super.isEmpty()){
            return super.getFuelConsumption();
        }else{
            return super.getFuelConsumption() + 1.4;
        }
    }

    @Override
    public void refilFuel(double ammount) {
        if (ammount + getFuelQuantity() > getTankCapacity() ){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.refilFuel(ammount);
    }
}

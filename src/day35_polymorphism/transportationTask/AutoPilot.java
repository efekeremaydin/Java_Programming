package day35_polymorphism.transportationTask;

public interface AutoPilot extends AutoPark {

    // no need to override as it inherits automatically
    // in this interface AutoPilot we have 2 abs m
//    @Override
//    void autoPark();

    void selfDrive();
}

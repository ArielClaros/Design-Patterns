package Java.Location;

public class LocationBuilderImple implements LocationBuilder{
    private String status;
    private String origin;
    private String destination;

    public LocationBuilderImple setStatus(String status){
        this.status = status;
        return this;
    }

    public LocationBuilderImple setOrigin(String origin){
        this.origin = origin;
        return this;
    }

    public LocationBuilderImple setDestination(String destination){
        this.destination = destination;
        return this;
    }

    @Override
    public Location build() {
        return new Location(status, origin, destination);
    }    
}

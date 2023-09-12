package Java.Location;

public class Location {
    private Status status;
    private String origin;
    private String destination;

    public Location(Status status, String origin, String destination){
        this.status = status;
        this.origin = origin;
        this.destination = destination;
    }

    public Status getStatus() {
        return status;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }
}

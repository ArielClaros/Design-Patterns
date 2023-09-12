package Java.Location;

public class Location {
    private final Status status;
    private final String origin;
    private final String destination;

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

    public static LocationBuilder getBuilder(){
        return new LocationBuilder();
    }

    public static class LocationBuilder{
        private Status status;
        private String origin;
        private String destination;

        public LocationBuilder status(Status status){
            this.status = status;
            return this;
        }

        public LocationBuilder origin(String origin){
            this.origin = origin;
            return this;
        }

        public LocationBuilder destination(String destination){
            this.destination = destination;
            return this;
        }

        public Location build(){
            return new Location(this.status, this.origin, this.destination);
        }
    }

    public static class Main{
        public static void main(String[] args) {
            Location location = Location.getBuilder()
                    .status(Status.SENT)
                    .origin("Miami")
                    .destination("Ecuador")
                    .build();

            System.out.println(location.getDestination());
        }
    }
}

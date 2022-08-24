package lv.javaguru.student_artjomsb_homework.homework3.senior;

class Plane {
    private String location;
    String model;
    private boolean isInFlight;
    private String travelTarget;
    private String lastLocation;

    Plane(String model, String location, boolean isInFlight) {
        this.model = model;
        this.location = location;
        this.isInFlight = isInFlight;
    }

    void travel(String city) {
        System.out.println("Plane start flight in " + city);
        this.isInFlight = true;
        lastLocation = this.location;
        this.location = "Unknown";
        travelTarget = city;
    }

    void finishTravel() {
        if (this.isInFlight) {
            this.location = travelTarget;
            travelTarget = "";
            System.out.println("Plane reach the " + location);
        }
        if (!this.isInFlight) {
            System.out.println("Plane now in " + location);
        }
        this.isInFlight = false;
    }

    void getLocation() {
        if (this.isInFlight) {
            System.out.println("Plane in flight, last location " + lastLocation);
        } else {
            System.out.println("Plane location: " + location);
        }
    }

    void planeInfo() {
        if (!this.isInFlight) {
            System.out.println("Plane " + model + " now in " + location);
        } else {
            System.out.println("Plane " + model + " now in flight to " + travelTarget);
        }
    }
}

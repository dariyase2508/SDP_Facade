public class BookingFacade {
    private final BusService busService = new BusService();
    private final TrainService trainService = new TrainService();
    private final FlightService flightService = new FlightService();
    private final TaxiService taxiService = new TaxiService();

    public void bookComplexTrip(String destination) {
        System.out.println("Beginning of the trip organisation");

        taxiService.bookTaxiTicket("To the station");
        trainService.bookTrainTicket("Astana - Atyrau");
        flightService.bookFlightTicket(destination);
        busService.bookBusTicket("From the airport to the hotel");

        System.out.println("The trip was successfully formalised!");
    }

    public void bookingTripToAitu(String destination){
        System.out.println("Beginning of the trip organisation");

        taxiService.bookTaxiTicket("To the airport");
        flightService.bookFlightTicket(destination);
        busService.bookBusTicket("To the university");

        System.out.println("The trip was successfully formalised!");
    }
}

public class Main{
    public static void main(String[] args){
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.bookComplexTrip("Istanbul");

        bookingFacade.bookingTripToAitu("Astana");
    }
}
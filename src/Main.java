public class Main{
    public static void main(String[] args){
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.bookComplexTrip("Istanbul");

        System.out.println();

        bookingFacade.bookingTripToAitu("Astana");
    }
}
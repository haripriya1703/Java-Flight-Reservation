import com.haripriya.flightreservation.dao.ReservationDao;
import com.haripriya.flightreservation.dao.ReservationDaoImpl;
import com.haripriya.flightreservation.model.Passenger;
import com.haripriya.flightreservation.model.Reservation;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        Reservation reservation= new Reservation();
        ReservationDao dao = new ReservationDaoImpl();
        passenger.setId(123L);
        passenger.setFirstName("Hari Priya");
        passenger.setLastName("Nidadavolu");
        passenger.setPhone("123456");
        passenger.setEmail("hari@gmail.com");
        reservation.setPassenger(passenger);
        reservation.setId(1L);

        Reservation reserved= dao.bookFlight(reservation);
        System.out.println(reserved);
        System.out.println(dao.checkIn(1,reserved.getId()));
    }
}
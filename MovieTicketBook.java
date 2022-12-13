package atmApplication;

import java.util.Scanner;

class Theatre {
	int seats = 50;
	private static Theatre t = null;
	private Theatre() {

	}
	public static Theatre getInstance() {
		if (t == null) {
			t = new Theatre();
		}
		return t;
	}
	public void reserveSeats(int numTickets) {
		if (numTickets > seats) {
			System.out.println(numTickets + "are not available");
			System.out.println(seats + "are available");
			return;
		}
		seats = seats - numTickets;
		System.out.println(numTickets + "seats are booked");
		System.out.println(seats + "are available");
	}
}
class BookingApp {
	public void bookTickets() {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many tickets");
		int ticket = sc.nextInt();
		Theatre theater = Theatre.getInstance();
		theater.reserveSeats(ticket);
//		sc.close();
	}
}
public class MovieTicketBook {
	public static void main(String[] args) {
		BookingApp cust1 = new BookingApp();
		cust1.bookTickets();
		BookingApp cust2 = new BookingApp();
		cust2.bookTickets();
		BookingApp cust3 = new BookingApp();
		cust3.bookTickets();
		//try ac and non ac room book
	}
}


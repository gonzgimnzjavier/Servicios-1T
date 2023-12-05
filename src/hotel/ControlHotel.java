package hotel;

public class ControlHotel {

	public static void main(String[] args) {
		
		hotel hotel = new hotel(30);
		
		for (int i = 0; i < 50; i++) {
			Cliente cliente = new Cliente("Cliente numero: " + i, hotel);
		}
	}
}

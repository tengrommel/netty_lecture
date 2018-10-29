package com.teng.collections.collection;

public class main {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Olympian", 8, 12);
		theatre.getSeats();
		if (theatre.reserveSeat("H11")){
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry, seat is taken");
		}
		if (theatre.reserveSeat("H11")){
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry, seat is taken");
		}
	}
}

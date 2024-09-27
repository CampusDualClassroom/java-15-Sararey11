package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise15 {

	public static void main(String[] args) {
		FreshMerchandise fm = new FreshMerchandise("Melocotones", "001-9", "Frutería de hoy S.L.", 8, "A", "118D", 80,
				Calendar.getInstance().getTime());
		fm.printSpecificData();
		System.out.println(fm.getLocation());

	}

}

package dentist;

import java.io.Serializable;

import dentist.Procedure.TypeOfOperation;

public class Main{

	public static void main(String[] args) {
		PatientInformation pi1 = new PatientInformation("Кацюк Дмитрий Геннадьевич", 1234);
		Procedure denta1 = new Procedure(TypeOfOperation.DENTALFILLING);
		pi1.setProcedure(denta1);
		pi1.payForProcedure();// Метод для оплаты операции.
		// System.out.println(pi1);
		// System.out.println("----------------------");
		PatientInformation pi2 = new PatientInformation("Барталев Павел Эдуардович", 1235);
		Procedure denta2 = new Procedure(TypeOfOperation.DENTALPROSTHETICS);
		pi2.setProcedure(denta2);
		// System.out.println(pi2);

		PatientArrayList patientArrayList = new PatientArrayList();
		patientArrayList.addParient(pi1);
		patientArrayList.addParient(pi2);
		
		// patientArrayList.showArrayList();
		// patientArrayList.showArrayList();//Метод вывода всего списка.
		// patientArrayList.searchPatient("Кацюк");//Метод поиска по фамилии.
		// patientArrayList.searchDebtors();//Метод поиска должников.
		// patientArrayList.removeAllWithoutDebt();// Метод удаления пациентов без долгов.
		// patientArrayList.showArrayList();
		
		patientArrayList.save("./patients.ser");
		
		patientArrayList.clearList();
		
		patientArrayList.showArrayList();
		
		patientArrayList.load("./patients.ser");
		
		patientArrayList.showArrayList();
	}
}

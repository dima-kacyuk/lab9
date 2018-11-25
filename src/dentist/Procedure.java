package dentist;

public class Procedure {

	private TypeOfOperation operationType;
	private int operationPrice;

	enum TypeOfOperation {
		DENTALPROSTHETICS, DENTALFILLING, DENTALIMPLANTATION;
	}

	Procedure(TypeOfOperation operationType) {
		this.operationType = operationType;

		setOperationPrice();
	}

	public int getOperationPrice() {
		return operationPrice;
	}

	public TypeOfOperation getOperationType() {
		return operationType;
	}

	public void setOperationPrice() {

		switch (operationType) {

		case DENTALPROSTHETICS:
			operationPrice = 344;
			break;

		case DENTALFILLING:
			operationPrice = 260;
			break;

		case DENTALIMPLANTATION:
			operationPrice = 120;
			break;

		default:
			System.out.println("Недопустимый тип операции.");
			break;
		}
	}

	public String toString() {
		return "Тип операции: " + operationType.toString() + "\nСтоимость операции: " + operationPrice;
	}
}

package discount_calculation;

public class Main {

	public static void main(String[] args) {

		PaymentTerminal terminal = new PaymentTerminal(); //�������� ���������� ������ PaymentTerminal
		terminal.printItemsList(); //����� ������ ��������� ���������
		
		Customer c = new Customer(); //�������� ���������� ������ Customer	
		
		terminal.calcTotal(terminal.getPrice(c.chooseItem()), c.setNumber()); //������ �������� ����		
	}

}

package MultilevelInheritance;

import java.util.Scanner;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter modelno, version, slottype");
		String modelno = s.nextLine();
		String version = s.nextLine();
		String slottype = s.nextLine();
		
		Iphone i = new Iphone();
		Iphone i1 = new Iphone(modelno, version, slottype);
		i1.setModelno(modelno);
		i1.setVersion(version);
		i1.setslottype(slottype);
		i1.slot();
		i1.accept();
		i1.display();
		System.out.println(i1);

	}

}

package _03_intermediate._10_enum;

public class BasicEnumTest {
	
	public static void main(String[] args) {
		Division d1 = Division.판타지;
		Division d2 = Division.valueOf("공포");
		Division d3 = Enum.valueOf(Division.class, "드라마");
		
		System.out.println("get Division >>> ");
		System.out.println("d1 ? " + d1);
		System.out.println("d2 ? " + d2);
		System.out.println("d3 ? " + d3);
		
		System.out.println("\ncompare Division >>>");
		System.out.println("d1 == d2 ? " + (d1==d2));
		System.out.println("d1 == d3 ? " + (d1==d3));
		System.out.println("d1 < d2 ? ERROR" );
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
		
		System.out.println("\nswitch case of enum >>> ");
		switch(d1) {
		case 판타지:
			System.out.println("This Division is 판타지");
			break;
		case 공포:
			System.out.println("This Division is 공포");
			break;
		case 드라마:
			System.out.println("This Division is 드라마");
			break;
		}
	}
}

public class Classroom
{
	public static void main (String[] args)
	{
		Wilder Maya=new Wilder("Maya", true);
		Wilder Diane= new Wilder("Diane", false);
		Wilder Randria= new Wilder("Randria", true);
		System.out.println(Maya.whoAmI());
		System.out.println(Diane.whoAmI());
		System.out.println(Randria.whoAmI());
	}
	
}

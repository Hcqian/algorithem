package Lintcode;


public class main {
	public static main m=new main();
	{
		System.out.println("dongtai");
	}
	main(){
		System.out.println("gouzao");
	}
	static{
		System.out.println("jingtai");
	}
	
	
	public static void main(String[] args) {
		main m=new main();
		new main();
		Class<?> s=main.class;
	}
}

package scs;

public class IntializerStaticConstructor {
    static
    {
    	System.out.println("Static Block");
    }
    
    public IntializerStaticConstructor() {
    	System.out.println("Constructor");
	}
    
	public static void main(String[] args) {
		System.out.println("Main");
		IntializerStaticConstructor obj = new IntializerStaticConstructor();

	}
	
	{
		System.out.println("Initializer Block");
	}

}

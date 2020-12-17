package Javatut;

public class Loopstmt {
	
	public void forloop()
	{
		System.out.println("For loop:");
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			if(i==5)
			{
				break;
			}
		}
	}
    public void whileloop()
    {
    	int j=10;
    	System.out.println("while loop:");
    	while(j<15)
    	{
			
    	System.out.println(j);
    	j=j+1;
    	}
    }
    public void dowhile()
    {
    	int k=20;
		System.out.println("dowhile loop:");
    	do
    	{
    	System.out.println(k);
    	k=k+1;
    	}while(k<25);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Loopstmt ob=new Loopstmt();
		ob.forloop();
		ob.whileloop();
		ob.dowhile();
	}

}

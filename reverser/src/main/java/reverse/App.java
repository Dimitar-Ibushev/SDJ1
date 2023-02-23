package reverse;


public class App 
{
    public static void main( String[] args )
    {
        String example = "String to be reversed";
        String inverted = "";
        int location = example.length() - 1 ;
        
        for(int i = example.length() - 1; i >= 0 ; i--)
        {
        	if ((example.charAt(i) == ' '))
        	{
        		for(int a = i; a < location; a++)
        		{
        			inverted += example.charAt(a + 1);
        		}
        		if(inverted.charAt(inverted.length() - 1) != ' ')
        			inverted += " ";
        		location = i;
        	}
        	else if(i == 0)
        	{
        		for(int a = i; a < location; a++)
        		{
        			inverted += example.charAt(a);
        		}
        		location = i;
        	}
        }
        
        System.out.println(inverted);
        
    }
}

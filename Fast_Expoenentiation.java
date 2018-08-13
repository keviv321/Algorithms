package Algorithms;

public class Fast_Expoenentiation {
	
	public int power(int exp, int pow)
	{
		if (pow==0)
			return 1;
		else if (pow == 1)
			return exp;
		else
		{
			int rem = power(exp , pow/2);
			if (pow%2 == 0)
			{
				return rem*rem;
			}
			else
				return rem*exp*rem;
		}
	}
	
	public long power(int exp , int pow , int mod)
	{
		if (pow == 0)
			return 1;
		else
		{
			long rem = power(exp, pow/2, mod);
			if (pow%2 == 0)
				return (rem*rem)%mod;
			else
				return (rem*rem*exp)%mod;
				
		}
			
	}

}

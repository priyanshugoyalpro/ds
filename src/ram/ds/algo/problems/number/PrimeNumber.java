package ram.ds.algo.problems.number;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countPrime(299));
		System.out.println(countPrime(20));
		System.out.println(countPrime(30));
		System.out.println(countPrime(40));

	}
	
	public static int countPrime(int n)
	{
		boolean primes [] = new boolean[n];
		
		for(int i=0;i<primes.length;i++)
		{
			primes[i]=true;
		}
		
		for(int i=2;i*i<primes.length;i++)
		{
			if(primes[i])
			{
				for(int j=i;j*i<primes.length;j++)
				{
					primes[j*i]= false;
				}
			}
		}
		
		int primeCount=0;
		for(int i=2; i<primes.length;i++)
		{
			if(primes[i])
			primeCount++;
		}
		
		return primeCount;
	}

}

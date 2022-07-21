
public class s15loops {

	public static void main(String[] args) {
		
//for(int i=0;i<10;i++)
//{
//	System.out.println(i++);
//}
//for(int i=0;i<10;i++)
//{
//System.out.println(++i);
//}
//
//for(int i=1;i<10;i++)
//{
//	for(int j=1;j<i;j++)
//	{
//		System.out.print("*");
//	}
//System.out.println();
//}
//even no.s btw 22 and 99
//for(int i=22;i<=98;i++)
//{
//	if(i%2==0)
//	{
//		System.out.println(i);
//		
//		i++;
//	}
//	else i++;
//}
		//sumof all no.s divided by 3 and 5 btw 1 and 100
	int sum=0;
	for(int i=1;i<=100;i++)
	{
		if(i%3==0 && i%5==0)
			sum=sum+i;
	}
	System.out.println(sum);
	
	
	int sum=0, count=0;
	for(int i=1;i<=100;i++)
	{
		if(i%3==0 && i%5==0)
		{	sum=sum+i;
		count++;	
		}
		if(count==5) break;}
	System.out.println(sum);
	System.out.println(count);
	}
	}

}



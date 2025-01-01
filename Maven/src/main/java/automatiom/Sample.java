package automatiom;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample a=new Sample();
		Sample b=new Sample();		
		a.add(3.5f,6.7f);
		b.add(6.9f, 4.7f);
		
	}
	public float add(float a,float b)
	{
	float c=a+b;
	System.out.println(c);
	return c;
	}
	public float sub(float a,float b)
	{
	float c=a-b;
	System.out.println(c);
	return c;
	}

	}



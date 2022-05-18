public class Shape{
	int shape(int l,int b){
	return(l*b);
	}
	double shape(double b,double h){
		return(0.5*b*h);
	}
    double shape(double r){
        return(3.14*r*r);	
}

   public static void main(String args[]){
     Shape obj = new Shape();
     System.out.println("The area of rectangle"+obj.shape(4,4));
	 System.out.println("The area of triangle"+obj.shape(6,4));
	 System.out.println("The area of circle"+obj.shape(8));
   }
}
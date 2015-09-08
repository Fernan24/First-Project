


public class QuadraticEquation {
	 
	    private float a;  //coefficient of degree 2 term
	    private float b;  //coefficient of degree 1 term
	    private float c;  //coefficient of degree 0 term (constant term)
	    private double discriminant_result; //result of the sqrt of the quadratic equation
	    private  int solution_amount; //amount of real solutions
	    private float x1, x2; //solutions to the quadratic formula
	    FLOATPair pair = new FLOATPair(a,b);
	    private String result;
	   
	    /**
	     *Constructs an object of type QuadraticEquation
	     *@param a is the coefficient of the term of degree 2
	     *@param b is the coefficient of the term of degree 1
	     *@param c is the coefficient of the term of degree 0 or the constant
	     */
	    public QuadraticEquation(float a, float b, float c) { 
	          this.a = a; 
	          this.b = b; 
	          this.c = c; 
	    }

		/**
		 * @return the a
		 */
		public float getA() {
			return a;
		}

		/**
		 * @return the b
		 */
		public float getB() {
			return b;
		}

		/**
		 * @return the c
		 */
		public float getC() {
			return c;
		}
		
		/**
		 * This method will calculate the discriminant of the quadratic formula
		 * @param a the coefficient a
		 * @param b the coefficient b
		 * @param c the coefficient c
		 * @return the result of the discriminant
		 */
		public double discriminat(float a, float b, float c){
			discriminant_result = Math.sqrt( Math.pow(b, 2)-(4*a*c));
			return discriminant_result;
		}
		
		
		/** Counts number of different real solutions the equation
        has. 
        @return An integer value in range 0..2 (0, 1, or 2)
                corresponding to the number of different real 
                solutions that the equation has. 
		 */
		public int realSolutionsCount() {
			if (discriminant_result>0){
				solution_amount=2;
			}
			else if(discriminant_result==0){
				solution_amount=1;
			}
			else if(discriminant_result<0){
				solution_amount=0;
			}
			return solution_amount;	
		}
		
		/** Returns the real solutions of the equation, if any. 
        @return Reference to a new object (a pair of Float 
                objects) if the equation has at least one real
                solution. If no real solution, it then returns
                null value. In the case of only one real solution, 
                both components of that pair reference the same
                Float object whose value is that real solutions. 
                If it has two real solutions, the components 
                of that pair object are references to both, 
                respectively.
		 */
		public FLOATPair getRealSolutions() {
			
			
			switch (solution_amount){
			case 0:
				System.out.println("There are no real solutions.");
				
			case 1:
				x1= (float)(-b + discriminant_result)/(2*a);pair.setFirst(x1);
				pair.setFirst(x1);
				
			case 2:
				x1= (float)(-b + discriminant_result)/(2*a);
				x2= (float)(-b - discriminant_result)/(2*a);
				pair.setFirst(x1);
				pair.setSecond(x2);	
			} return null;
		} 
		/**
		 * this method will display the real solutions if any
		 * @return a string with the solutions
		 */
		public String displayFLOATPair(){
			if (solution_amount>0){
				a = pair.getFirst();
				b = pair.getSecond(); 
				result ="("+ a + "," + b + ")";
				System.out.println(result);	
			}
			else {
				result = null;
			}
			return result;
		}
	}
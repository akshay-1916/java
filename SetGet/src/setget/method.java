package setget;

public class method {
          private String name;
          private String Id;
          private double salary;
          
          public method(String name,String Id,double salary) {
        	  setName(name);
        	  setId(Id);
        	  setSalary(salary);
          }
          
          public void setName(String name) {
        	  this.name=name;
          }
          
          String getName() {
        	  return name;
          }
          
          public void setId(String Id) {
        	  this.Id=Id;
          }
          
          String getId() {
        	  return Id;
          }
          
         public void setSalary(double salary) {
            	  this.salary=salary;
              }
              
          

		double getSalary() {
            	  return salary;
           }
            
		@Override
		public String toString() {
			return "method [name=" + name + ", Id=" + Id + ", salary=" + salary + "]";
		} 
          
}

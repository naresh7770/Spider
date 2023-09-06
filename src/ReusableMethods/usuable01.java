package ReusableMethods;

public class usuable01 {
   public static void main(String[] args) throws Throwable {
	
	   Methods m1=new Methods();
	   String url=m1.property("url");
	   String un=m1.property("un");
	   String pw=m1.property("pw");
     System.out.println(url);
     System.out.println(un);
     System.out.println(pw);
     
     
     String a=m1.Exceldata("Iphones", 8, 0);
     System.out.println(a);
}	
}

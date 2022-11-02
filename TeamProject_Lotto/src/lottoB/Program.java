package lottoB;

public class Program {
	 public static void main(String[] args) {
	        /*
	         * 로또 프로그램을 작성하시오.
	         */
	 
	        Machine machine = new Machine();
	        Menu menu = new Menu();
	        while (true) {
	            String key = menu.Select();
	 
	            if (key != null) {
	                machine.start();
	            }
	        }
	 
	    }
}

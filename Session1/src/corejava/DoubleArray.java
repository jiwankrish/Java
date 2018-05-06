package corejava;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//First Array Represents the row 
		//second Array Represents column
		String flights[][]= new String [4][4];
	
				
	// First row
		flights[0][0]=	"Dallas";
		flights[0][1]=	"San Fransisco";
		flights[0][2]=	"Atlanta";
		flights[0][3]=	"New York";
		
	// Second row
		flights[1][0]=	"Maimi";
		flights[1][1]=	"Portland";
		flights[1][2]=	"Seatle";
		flights[1][3]=	"Las Vegas";
		
	// Third row
		flights[2][0]=	"Boston";
		flights[2][1]=	"New Orleans";
		flights[2][2]=	"Denver";
		flights[2][3]=	"Kansas";
		
	// Fourth row	
		flights[3][0]=	"Chicago";
		flights[3][1]=	"Honolulu";
		flights[3][2]=	"Charlotte";
		flights[3][3]=	"Houstan";
		
		
		//System.out.println(flights[2][3]);
		
		int rows= flights.length;
		int cols= flights[0].length;
		
		//argument for rows
		for (int rownum=0;rownum<rows;rownum++) {
			
		//argument for Column
		for (int colnum=0;colnum<cols;colnum++) {
			
	 System.out.println(flights[rownum][colnum]);
	 
		}
			
		}
		
		
		
		
		
	}

}

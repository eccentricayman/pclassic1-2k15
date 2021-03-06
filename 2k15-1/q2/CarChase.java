import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CarChase {
 
    public static void main(String[] args) throws IOException{
    // Before submitting, make sure the main method hasn't been changed!
        String plate = "";
         BufferedReader br = new BufferedReader(new FileReader(
                    "CarChaseIN.txt"));
            while (br.ready()) {
               plate = br.readLine();
               System.out.println(validPlate(plate));  
            }
            br.close();
    }

    // Fill out the body of this method
    public static int validPlate(String license){
        String current;
	int sum = 0;
	int n = 10;
	for(int i=0; i < license.length(); i++){
	    if(license.charAt(i) == '-'){
		sum += 0;
	    }
	    else{
		sum += toint(license.charAt(i)) * n;
		n -=1;
	    }
	}
	if ((sum % 11) == 0){
	    return -1;
	}
	else{
	    return (11-(sum % 11) + toint(license.charAt(license.length()-1)))%11;
	}
    }

    public static int toint(char x){
	if(x == '1'){
	    return 1;
	}
	if(x == '2'){
	    return 2;
	}
	if(x == '3'){
	    return 3;
	}
	if(x == '4'){
	    return 4;
	}
	if(x == '5'){
	    return 5;
	}
	if(x == '6'){
	    return 6;
	}
	if(x == '7'){
	    return 7;
	}
	if(x == '8'){
	    return 8;
	}
	if(x == '9'){
	    return 9;
	}
	else{
	    return 0;
	}
	
    }
}

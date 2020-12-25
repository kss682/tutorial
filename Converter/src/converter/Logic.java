package converter;

public class Logic {
	private static String conv_types[] = {"Celcius <-> Farenheit", "Celcius <-> Kelvin", "Inches <-> Centimeter"};
	
	public static String[] getConv_types() {
		return conv_types;
	}
	
	public static float CtoF(float data) {
		return (data*9)/5 + 32;
	}
	
	public static float FtoC(float data) {
		return ((data - 32)*5)/9;
	}

	public static float CtoK(float data) {
		return (float) (data + 273.15);
	}
	
	public static float KtoC(float data) {
		return (float)(data - 273.15);
	}
	
	public static float ItoC(float data) {
		return (float)(data*2.54);
	}
	
	public static float CtoI(float data) {
		return (float)(data/2.54);
	}
	//reverse boolean to determine whether reverse conversion of the type to be done
	public static String process(String input,String type, boolean reverse) {
		String ans = null;
		try {
			float temp = Float.parseFloat(input);
			if(reverse == true) {
				if(type == conv_types[0]) {
					ans = Float.toString(FtoC(temp));
				}
				else if(type == conv_types[1]) {
					ans = Float.toString(KtoC(temp));
				}
				else if(type == conv_types[2]) {
					ans = Float.toString(CtoI(temp));
				}
			}
			else {
				if(type == conv_types[0]) {
					ans = Float.toString(CtoF(temp));
				}
				else if(type == conv_types[1]) {
					ans = Float.toString(CtoK(temp));
				}
				else if(type == conv_types[2]) {
					ans = Float.toString(ItoC(temp));
				}
			}
		}catch(Exception e) {
			ans = "Input value wrong format";
		}

		return ans;
		
	}
}

package dk.sdu.gms.dds.generator

public class CommonCode {
	public static def getCommon () '''
	void print_mac(const uint8_t* mac) {
	  Serial.println(mac_to_string(mac));
	}
	
	String mac_to_string(const uint8_t* mac) {
	  String result = "";
	  for (int i = 0; i < 6; i++) {
	    result += String(mac[i], HEX);
	    if (i != 6 - 1) {
	      result += ":";
	    }
	  }
	  return result;
	}
	'''
}
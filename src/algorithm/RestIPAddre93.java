package algorithm;

import java.util.ArrayList;
import java.util.List;

public class RestIPAddre93 {
	List<String> list = new ArrayList<>();

	public List<String> restoreIpAddresses(String s) {
		partIP(4, s, "");
		return list;
	}

	public void partIP(int i, String s, String ip) {
		if (s.length() > i * 3 || s.length() < i)
			return;
		if (i == 1) {
			if ((s.length() > 1 && s.charAt(0) == '0')||(s.length()==3 && s.compareTo("255") > 0)) 
							return;
			list.add(ip + s);
			return;
		}
		for (int j = 1; j <= 3; j++) {
			if (j > s.length())
				break;
			if (j > 1 && s.charAt(0) == '0')
				{break;}
			if (j == 3 && s.substring(0, j).compareTo("255") > 0)
				break;
			partIP(i - 1, s.substring(j), ip + s.substring(0, j) + ".");
		}

	}
}

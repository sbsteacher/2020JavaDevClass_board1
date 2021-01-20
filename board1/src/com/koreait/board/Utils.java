package com.koreait.board;

import javax.servlet.http.HttpServletRequest;

public class Utils {
	public static int getParameterInt(HttpServletRequest request, String key, int def) {
		return getParameterInt(request, key) == 0 ? def : getParameterInt(request, key);
	}
	
	public static int getParameterInt(HttpServletRequest request, String key) {
		String param = request.getParameter("page");
		int result = parseStringToInt(param);
		return result;
	}
	
	public static int parseStringToInt(String val) {
		try {
			return Integer.parseInt(val);
		} catch(Exception e) {}
		return 0;
	}
}

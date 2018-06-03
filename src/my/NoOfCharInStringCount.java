package my;

public class NoOfCharInStringCount {
	public static int count(String str,char ch) {
		int totalCh=0;
		char [] chAry = str.toCharArray();
		if(ch=='\0')
			return 1;
		for(int i=0; i<str.length();i++) {
			if(ch==chAry[i])
				totalCh++;
		}
		return totalCh;
	}
}

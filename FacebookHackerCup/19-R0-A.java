import java.io.*;
import java.util.*;

public class A {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
		for(int _=1; _<=t; ++_) {
			char[] s=in.next().toCharArray();
			int x=0;
			for(char c : s)
				x+=c=='B'?1:0;
			System.out.println("Case #"+_+": "+(x<s.length-1&&2*x>=s.length-1?"Y":"N"));
		}
		out.close();
	}
	
	static class Reader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(Exception e) {}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}

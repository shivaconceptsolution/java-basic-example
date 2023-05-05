package scs;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);  //hello world

		StringBuilder sb1 = new StringBuilder("hello");
		sb1.append("world");
		System.out.println(sb1);
		String s = new String("hello");
		String s2 = s.concat("world");
		System.out.println(s);
		System.out.println(s2);


	}

}

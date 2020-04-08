package in.satheesh.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	Vector<String> names=new Vector<>();
	names.add("SATHEESH");
	names.add("Ananth");
	names.add("saravanan");
	names.add("karthik");names.add("Ramesh");
	names.add("Alex");
	names.add("siva");
	names.add("vivek");
	names.add("raghul");
	names.add("SATHEESH");
	int currentcap = names.capacity();
	System.out.println(currentcap);
	names.addElement("DEEPIKA");
	int currentcapacity = names.capacity();
	System.out.println(currentcapacity);

	}

}

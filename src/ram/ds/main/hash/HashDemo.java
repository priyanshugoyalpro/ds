package ram.ds.main.hash;

public class HashDemo {

	public static void main(String [] args) {
		HashTableArray<String> hm = new HashTableArray<String>(10);
		hm.put(11, "Priyanshu");
		hm.put(12, "Shivanshu");
		hm.put(13, "Divyanshu");
		hm.put(14, "Himanshu");
		hm.put(15, "Sudhanshu");
		hm.put(11, "Apoorva");
		
		System.out.println(hm.get(11));
		
	}
	

}

package question1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


class priceComparator implements Comparator<Merchandises>{
	@Override
	public int compare(Merchandises a, Merchandises b) {
		return (int) (b.getPrice() - a.getPrice());
	}

}
public class Main {
	public static void main(String[] args) {
		List<Merchandises> list=new ArrayList<>();
		try {
			BufferedReader br=new BufferedReader(new FileReader(new File("text.txt")));
			String str=null;
			while((str=br.readLine())!=null) {
				String [] arr=str.split(" ");
				Merchandises m=new Merchandises(arr[0],Integer.parseInt(arr[1]),Double.parseDouble(arr[2]));
				list.add(m);
				
			}
			System.out.println("SOrting on the BAsis of ID");
			//sorting on the basis of Id/name
			Collections.sort(list);
			for(Merchandises x: list) {
				System.out.println(x);
			}
			
			System.out.println("SOrting on the BAsis of Prices");
			//SOrting on the basis Price
			Collections.sort(list, new priceComparator());
			for(Merchandises x: list) {
				System.out.println(x);
			}
			br.close();
			
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	
	}
	
}

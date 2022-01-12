package streamTutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ankara");
		arrayList.add("Samsun");
		arrayList.add("Eski�ehir");
		arrayList.add("Adana");
		
		
		/*
		Stream<String> stream = arrayList.stream(); //string tutan stream olu�tur
		
		//filter
		Stream<String> resultStream = stream.filter(new Predicate<String>() {	//sonucu yeni stream e att�k
			@Override
			public boolean test(String t) {
				return t.startsWith("A");	//string A ile ba�l�yorsa filtreden d�nd�r�l�r.
			}
		});
		
		Stream<String> upperedStream = resultStream.map(new Function<String,String>(){

			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
			
		});
		
		Stream<String> sortedStream = upperedStream.sorted(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		sortedStream.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		*/
		/////////////B�RD��ER YOL �LE///////////////////
		arrayList.stream()
		.filter((s) -> s.startsWith("A"))
		.map((s) -> s.toUpperCase())
		.sorted((s1,s2) -> s1.compareTo(s2))
		.forEach(System.out::println);
	}
}

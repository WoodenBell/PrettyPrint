package io.github.woodenbell.pprint.test;

import org.junit.Test;

import io.github.woodenbell.pprint.CollectionPrint;
import io.github.woodenbell.pprint.Util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionTest {

	@Test
	public void ListTest() {
		
		System.out.println("- Testing List pprint");
		System.out.println();
		
		ArrayList<String> people = new ArrayList<>();
		people.add("Sherlock Holmes, 37 years old, lives at 221B baker Street");
		people.add("Me, 16 years old, lives in the middle of nothing");
		people.add("Someone else, ? years old");
		people.add("How many people are left?");
		people.add("People filler #1");
		people.add("People filler #2");
		people.add("John Smith");
		people.add("John Smith II");
		people.add("John Smith III");
		people.add("And, again, John Smith IV");

		CollectionPrint.pprint(people);

		System.out.println();
		System.out.println();

		CollectionPrint.pprint(people, true);

		System.out.println();
		System.out.println();

		CollectionPrint.pprint(people, true, true, Util.TableFormat.EQUALS);
		System.out.println();
		System.out.println();

	}

	@Test
	public void MapTest() {
		
		System.out.println("- Testing Map pprint");
		System.out.println();

		HashMap<String, Double> balance = new HashMap<>();

		balance.put("John Smith", 345.66);
		balance.put("Aaron Daniels", 120.40);
		balance.put("Paul Klein", 12.0);
		balance.put("Karl Smith", -35.90);
		balance.put("Catherine Durant", 200.00);
		balance.put("Klein Smith", 145.66);

		CollectionPrint.pprint(balance);

		System.out.println();
		System.out.println();

		CollectionPrint.pprint(balance, true);

		System.out.println();
		System.out.println();

		CollectionPrint.pprint(balance, true, true, Util.TableFormat.UNDERSCORE);

		System.out.println();
		System.out.println();
	}

	@Test
	public void SetTest() {
		
		System.out.println("- Testing Set pprint");
		System.out.println();

		HashSet<Integer> firstPrimes = new HashSet<>();

		firstPrimes.add(1);
		firstPrimes.add(2);
		firstPrimes.add(3);
		firstPrimes.add(5);
		firstPrimes.add(7);
		firstPrimes.add(11);
		firstPrimes.add(13);
		firstPrimes.add(17);
		firstPrimes.add(19);
		firstPrimes.add(23);

		CollectionPrint.pprint(firstPrimes);

		System.out.println();
		System.out.println();

		CollectionPrint.pprint(firstPrimes, true);

		System.out.println();
		System.out.println();

		CollectionPrint.pprint(firstPrimes, true, true, Util.TableFormat.HYPHEN);

		System.out.println();
		System.out.println();
	}

	@Test
	public void QueueTest() {
		
		System.out.println("- Testing Queue pprint");
		System.out.println();

		ArrayDeque<Integer> firstNums = new ArrayDeque<>();

		firstNums.add(2);
		firstNums.add(3);
		firstNums.add(4);
		firstNums.add(5);
		firstNums.add(6);
		firstNums.add(7);
		firstNums.add(8);
		firstNums.add(9);

		firstNums.addFirst(1);
		firstNums.addLast(10);

		CollectionPrint.pprint(firstNums);

		System.out.println();
		System.out.println();

		CollectionPrint.pprint(firstNums, true);

		System.out.println();
		System.out.println();

		CollectionPrint.pprint(firstNums, true, true);

		System.out.println();
		System.out.println();
	}

	@Test
	public void errorTest() {
		
		System.out.println("- Testing pprint on collections with null elements or values");
		System.out.println();

		HashMap<String, String> hm1 = new HashMap<>();
		HashMap<String, String> hm2 = new HashMap<>();
		ArrayList<String> al = new ArrayList<>();

		HashSet<String> hs = new HashSet<>();

		hm1.put("wow", null);
		hm1.put("much null", null);
		hm1.put("not null", "3");

		hm2.put(null, "much null");
		hm2.put("not null", "3");

		al.add(null);
		al.add("wow");

		hs.add("hey");
		hs.add(null);

		CollectionPrint.pprint(hm1, true);
		CollectionPrint.pprint(hm2, true);
		CollectionPrint.pprint(hm2);

		CollectionPrint.pprint(al);

		CollectionPrint.pprint(hs);

	}

}

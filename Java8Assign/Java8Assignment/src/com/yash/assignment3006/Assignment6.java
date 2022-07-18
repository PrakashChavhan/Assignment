package com.yash.assignment3006;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

//Question no 6

class Item1 {
	float itemno;

	protected Item1() {
		super();

	}

	public float getItemno() {
		return itemno;
	}

	public void setItemno(float itemno) {
		this.itemno = itemno;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public float getItemprice() {
		return itemprice;
	}

	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}

	protected Item1(float itemno, String itemname, float itemprice) {
		super();
		this.itemno = itemno;
		this.itemname = itemname;
		this.itemprice = itemprice;
	}

	String itemname;
	float itemprice;

}

public class Assignment6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item1> I = new ArrayList<Item1>();
		I.add(new Item1(1, "mouse", 25000));
		I.add(new Item1(2, "keyboard", 50000));
		I.add(new Item1(3, "bag", 15000));

		double av = (double) I.stream().mapToDouble(obj -> obj.itemprice).average().getAsDouble();
		System.out.println("The Avrage Item price is :" + av);

		System.out.println("The Price Less than avgrage is");
		I.stream().filter(p -> p.itemprice < av).map(pm -> pm.itemprice) // fetching price
				.forEach(System.out::println); // iterating price
	}

}

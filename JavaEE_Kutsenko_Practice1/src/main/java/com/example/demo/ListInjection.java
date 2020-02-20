package com.example.demo;

import java.util.ArrayList;

public class ListInjection {

	private ArrayList<Node> list;
	
	public ListInjection() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Node> getList() {
		return list;
	}
	
	public void setList(ArrayList<Node> list) {
		this.list = list;
	}
	
	public void print() {
		System.out.print("\nContents of the list: ");
		for(Node node : list) {
			System.out.print(node.id + " ");
		}
		System.out.print('\n');
	}
	
	public static class Node {
		int id;
		
		public Node(int id) {
			this.id = id;
		}
	}

}

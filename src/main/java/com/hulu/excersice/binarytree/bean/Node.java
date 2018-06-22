package com.hulu.excersice.binarytree.bean;

public class Node {
	
	public int key;
	public int level;
	public Node left;
	public Node right; 
	public Node parent;

	public Node(int k, Node l, Node r, Node p) {
		this.key = k;
		this.left = l;
		this.right = r;
		this.parent = p;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

}

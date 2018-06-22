package com.hulu.excersice.binarytree.repository;

import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.hulu.excersice.binarytree.bean.Node;

@Repository
public class BinaryTreeRepository {

	public static TreeMap<Integer, Node> parent = new TreeMap<Integer, Node>();

	public Node getBinaryTree() {
		Node binaryTree = null;
		binaryTree = insert(binaryTree, 15);
		binaryTree = insert(binaryTree, 66);
		binaryTree = insert(binaryTree, 5);
		binaryTree = insert(binaryTree, 3);
		binaryTree = insert(binaryTree, 12);
		binaryTree = insert(binaryTree, 75);
		binaryTree = insert(binaryTree, 50);
		return binaryTree;
	}

	public Node insert(Node x, int key) {
		if (x == null) {
			parent.put(key, null);
			return new Node(key, null, null, null);
		} else if (x.getKey() < key) {
			x.setRight(insert(x.getRight(), key));
			x.getRight().setParent(x);
			if (parent.get(key) == null)
				parent.put(key, x);
			return x;
		} else if (x.getKey() > key) {
			x.setLeft(insert(x.getLeft(), key));
			x.getLeft().setParent(x);
			if (parent.get(key) == null)
				parent.put(key, x);
			return x;
		} else {
			x.setKey(key);
			return x;
		}
	}

}

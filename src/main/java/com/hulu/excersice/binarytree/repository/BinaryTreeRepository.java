package com.hulu.excersice.binarytree.repository;

import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.hulu.excersice.binarytree.bean.Node;
import com.hulu.excersice.binarytree.config.AppConfigBinaryTree;

@Repository
public class BinaryTreeRepository {
	
	@Resource
	private AppConfigBinaryTree appConfigNode;
	
	public static TreeMap<Integer, Node> parent = new TreeMap<Integer, Node>();

	public Node getBinaryTree() {
		Node binaryTree = null;
		try {
			for(String node : appConfigNode.getNodes()){
				int value = Integer.parseInt(node);
				binaryTree = insert(binaryTree, value);
			}
		} catch (Exception e) {
		}
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

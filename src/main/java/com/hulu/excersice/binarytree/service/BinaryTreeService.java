package com.hulu.excersice.binarytree.service;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hulu.excersice.binarytree.bean.Node;
import com.hulu.excersice.binarytree.repository.BinaryTreeRepository;

@Service
public class BinaryTreeService {

	private Scanner scanner;
	private LinkedList<Node> root = new LinkedList<Node>();
	private TreeMap<Integer, Integer> nodes = new TreeMap<Integer, Integer>();
	private final static Logger LOGGER = Logger.getLogger(BinaryTreeService.class.getName());

	@Autowired
	private BinaryTreeRepository binaryTreeRepository;

	public void printBinaryTree() {
		System.out.println("====================================");
		System.out.println("This is the binary tree: ");
		traverseTree(this.binaryTreeRepository.getBinaryTree());
		for (Map.Entry<Integer, Integer> entry : this.nodes.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Level: " + value + " Node: " + key);
		}
		System.out.println("====================================");
	}

	public String guessCousins() {
		String message = "";
		System.out.println("Enter node A: ");
		scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();

		System.out.println("Enter node B: ");
		scanner = new Scanner(System.in);
		String s2 = scanner.nextLine();
		
		try {
			int nodeA = Integer.parseInt(s1);
			int nodeB = Integer.parseInt(s2);
			if(isCousins(nodeA, nodeB))
				message = nodeA + " is cousin of " + nodeB;
			else
				message = nodeA + " is NOT cousin of " + nodeB;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		return message;
	}

	public boolean isCousins(int a, int b) {
		traverseTree(this.binaryTreeRepository.getBinaryTree());
		if (this.nodes.get(a) == this.nodes.get(b)
				&& BinaryTreeRepository.parent.get(a) != BinaryTreeRepository.parent.get(b))
			return true;
		else
			return false;
	}

	public void traverseTree(Node tree) {
		if (tree == null)
			return;
		if (tree.getParent() == null)
			this.nodes.put(tree.getKey(), 0);
		else
			this.nodes.put(tree.getKey(), this.nodes.get(tree.getParent().getKey()) + 1);
		this.root.add(tree);

		while (this.root.size() != 0) {
			Node n = this.root.poll();
			traverseTree(n.getLeft());
			traverseTree(n.getRight());
		}
	}
}

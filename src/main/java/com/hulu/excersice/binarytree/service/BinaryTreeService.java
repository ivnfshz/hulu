package com.hulu.excersice.binarytree.service;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hulu.excersice.binarytree.bean.Node;
import com.hulu.excersice.binarytree.repository.BinaryTreeRepository;

@Service
public class BinaryTreeService {

	private Scanner scanner;
	private LinkedList<Node> root = new LinkedList<Node>();
	private TreeMap<Integer, Integer> nodes = new TreeMap<Integer, Integer>();

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

	public void guessCousins() {
		System.out.println("Enter your username: ");
		scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.println("Your username is " + username);
	}

	private boolean isCousins(int a, int b) {
		traverseTree(this.binaryTreeRepository.getBinaryTree());
		if (this.nodes.get(a) == this.nodes.get(b)
				&& BinaryTreeRepository.parent.get(a) != BinaryTreeRepository.parent.get(b))
			return true;
		else
			return false;
	}

	private void traverseTree(Node tree) {
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

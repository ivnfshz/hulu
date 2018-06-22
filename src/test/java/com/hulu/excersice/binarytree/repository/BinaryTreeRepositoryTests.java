package com.hulu.excersice.binarytree.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.hulu.excersice.binarytree.bean.Node;
import com.hulu.excersice.binarytree.config.AppConfigBinaryTree;
import com.hulu.excersice.binarytree.service.BinaryTreeService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = { AppConfigBinaryTree.class,
		BinaryTreeService.class, com.hulu.excersice.binarytree.repository.BinaryTreeRepository.class })
public class BinaryTreeRepositoryTests {

	@Autowired
	private BinaryTreeRepository binaryTreeRepository;

	@Test
	public void getBinaryTreeTest(){
		Assert.assertNotNull(this.binaryTreeRepository.getBinaryTree());
	}

	@Test
	public void insertRootNodeBinaryTreeTest(){
		Assert.assertNotNull(this.binaryTreeRepository.insert(null, 32));
	}

	@Test
	public void insertChildLeftBinaryTreeTest(){
		Node node = new Node(10, null, null, null);
		Assert.assertNotNull(this.binaryTreeRepository.insert(node, 20));
	}

	@Test
	public void insertChildRightBinaryTreeTest(){
		Node node = new Node(10, null, null, null);
		Assert.assertNotNull(this.binaryTreeRepository.insert(node, 54));
	}
}

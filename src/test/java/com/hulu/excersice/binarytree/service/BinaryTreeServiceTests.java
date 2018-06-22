package com.hulu.excersice.binarytree.service;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.hulu.excersice.binarytree.config.AppConfigBinaryTree;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = { AppConfigBinaryTree.class,
		BinaryTreeService.class, com.hulu.excersice.binarytree.repository.BinaryTreeRepository.class })
public class BinaryTreeServiceTests {

	@Autowired
	private BinaryTreeService binaryTreeService;
	
	@Test
	public void isCousinsEqualsFalse() {
		Assert.assertFalse(this.binaryTreeService.isCousins(3, 12));
	}

	@Test
	public void isCousinsEqualsTrue() {
		Assert.assertFalse(this.binaryTreeService.isCousins(3, 50));
	}
}

package com.hulu.excersice.binarytree;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.hulu.excersice.binarytree.repository.BinaryTreeRepositoryTests;
import com.hulu.excersice.binarytree.service.BinaryTreeServiceTests;

@RunWith(Suite.class)
@SuiteClasses({ 
	BinaryTreeServiceTests.class,
	BinaryTreeRepositoryTests.class
	})
public class BinaryTreeApplicationTestSuite {

}

package com.hulu.excersice.binarytree.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public class PropertyTests {
    
	@Value("${root.nodes}")
    private String[] nodes;

    @Configuration
    @Import({PropertyTestConfiguration.class})
    static class ContextConfiguration {
    }
    
    @Test
    public void loadNodesFromPropertiesSourceTest() {
        Assert.assertNotNull(nodes);
    }
}

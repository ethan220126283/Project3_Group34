package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Resource;

import static org.junit.jupiter.api.Assertions.*;

class ResourceFactoryTest {

    @Test
    void createResource() {
        Resource resource = ResourceFactory.createResource(
                1,
                1,
                "link",
                "www.google.com",
                "A link to the Google search engine"
        );
        System.out.println(resource.toString());
        assertNotNull(resource);
    }
}
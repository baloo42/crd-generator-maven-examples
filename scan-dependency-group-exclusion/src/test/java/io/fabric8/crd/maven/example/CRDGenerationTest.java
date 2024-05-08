package io.fabric8.crd.maven.example;

import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class CRDGenerationTest {

  @Test
  void test() {
    URL resource =
        CRDGenerationTest.class.getResource("/META-INF/fabric8/multiples.sample.fabric8.io-v1.yml");
    assertNull(resource);

    URL resource2 = CRDGenerationTest.class.getResource(
        "/META-INF/fabric8/mycustomresources.other.sample.fabric8.io-v1.yml");
    assertNotNull(resource2);
  }

}

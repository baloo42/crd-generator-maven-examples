package io.fabric8.crd.maven.example;

import io.fabric8.kubernetes.api.model.apiextensions.v1.CustomResourceDefinition;
import io.fabric8.kubernetes.client.utils.KubernetesSerialization;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class CRDGenerationTest {

  @Test
  void test() throws IOException {
    KubernetesSerialization serialization = new KubernetesSerialization();
    try (var in = CRDGenerationTest.class.getResourceAsStream(
        "/META-INF/fabric8/multiples.sample.fabric8.io-v1.yml")) {
      var crd = serialization.unmarshal(in, CustomResourceDefinition.class);
      assertNotNull(crd);
      assertEquals(2, crd.getSpec().getVersions().size());
    }

    URL resource2 = CRDGenerationTest.class.getResource(
        "/META-INF/fabric8/mycustomresources.other.sample.fabric8.io-v1.yml");
    assertNull(resource2);
  }

}

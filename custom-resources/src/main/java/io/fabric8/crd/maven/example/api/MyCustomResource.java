package io.fabric8.crd.maven.example.api;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Group("other.sample.fabric8.io")
@Version("v1")
public class MyCustomResource extends CustomResource<Void, Void> {
}

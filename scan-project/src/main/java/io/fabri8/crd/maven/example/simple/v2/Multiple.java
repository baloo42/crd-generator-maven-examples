package io.fabri8.crd.maven.example.simple.v2;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Group("sample.fabric8.io")
@Version("v2")
public class Multiple extends CustomResource<MultipleSpec, Void> {
}

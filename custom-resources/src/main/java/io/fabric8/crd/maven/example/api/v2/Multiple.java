package io.fabric8.crd.maven.example.api.v2;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

@Group("sample.fabric8.io")
@Version("v2")
class Multiple extends CustomResource<MultipleSpec, Void> {
}

# vlingo-wire

[![Javadocs](http://javadoc.io/badge/io.vlingo/vlingo-wire.svg?color=brightgreen)](http://javadoc.io/doc/io.vlingo/vlingo-wire) [![Build](https://github.com/vlingo/vlingo-wire/workflows/Build/badge.svg)](https://github.com/vlingo/vlingo-wire/actions?query=workflow%3ABuild) [ ![Download](https://api.bintray.com/packages/vlingo/vlingo-platform-java/vlingo-wire/images/download.svg) ](https://bintray.com/vlingo/vlingo-platform-java/vlingo-wire/_latestVersion) [![Gitter chat](https://badges.gitter.im/gitterHQ/gitter.png)](https://gitter.im/vlingo-platform-java/community)

The VLINGO XOOM platform SDK wire protocol messaging implementations, such as with full-duplex TCP and UDP multicast, and RSocket, using VLINGO XOOM ACTORS.

Docs: https://docs.vlingo.io/vlingo-wire

### Important
If using snapshot builds [follow these instructions](https://github.com/vlingo/vlingo-platform#snapshots-repository) or you will experience failures.

### Bintray

```xml
  <repositories>
    <repository>
      <id>jcenter</id>
      <url>https://jcenter.bintray.com/</url>
    </repository>
  </repositories>
  <dependencies>
    <dependency>
      <groupId>io.vlingo</groupId>
      <artifactId>vlingo-wire</artifactId>
      <version>1.5.1</version>
      <scope>compile</scope>
    </dependency>
  </dependencies>
```

```gradle
dependencies {
    compile 'io.vlingo:vlingo-wire:1.5.1'
}

repositories {
    jcenter()
}
```

License (See LICENSE file for full license)
-------------------------------------------
Copyright © 2012-2020 VLINGO LABS. All rights reserved.

This Source Code Form is subject to the terms of the
Mozilla Public License, v. 2.0. If a copy of the MPL
was not distributed with this file, You can obtain
one at https://mozilla.org/MPL/2.0/.


### Licenses for Dependencies
SSLSocketChannel support under org.baswell.niossl under Apache 2.
Copyright 2015 Corey Baswell
Corey's suggestion is to copy his source to your project, which
we did due to Java version conflicts.


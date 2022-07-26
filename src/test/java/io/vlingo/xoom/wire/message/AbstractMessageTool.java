// Copyright © 2012-2022 VLINGO LABS. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.xoom.wire.message;

import io.vlingo.xoom.actors.testkit.TestWorld;
import io.vlingo.xoom.wire.BaseWireTest;
import io.vlingo.xoom.wire.node.MockConfiguration;

public class AbstractMessageTool extends BaseWireTest {
  protected MockConfiguration config = new MockConfiguration();
  protected TestWorld testWorld = TestWorld.start("xoom-wire-test");
}

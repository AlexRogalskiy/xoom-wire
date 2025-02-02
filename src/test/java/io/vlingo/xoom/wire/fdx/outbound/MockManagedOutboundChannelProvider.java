// Copyright © 2012-2022 VLINGO LABS. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.xoom.wire.fdx.outbound;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import io.vlingo.xoom.wire.node.Id;
import io.vlingo.xoom.wire.node.MockConfiguration;
import io.vlingo.xoom.wire.node.Node;

public class MockManagedOutboundChannelProvider implements ManagedOutboundChannelProvider {
  private final Map<Id, ManagedOutboundChannel> allChannels = new HashMap<>();
  private final MockConfiguration configuration;
  private final Id localNodeId;

  public MockManagedOutboundChannelProvider(final Id localNodeId, final MockConfiguration configuration) {
    this.localNodeId = localNodeId;
    this.configuration = configuration;

    for (final Node node : configuration.allNodes()) {
      allChannels.put(node.id(), new MockManagedOutboundChannel(node.id()));
    }
  }

  @Override
  public Map<Id, ManagedOutboundChannel> allOtherNodeChannels() {
    final Map<Id, ManagedOutboundChannel> others = new HashMap<>();

    for (final Node node : configuration.allNodes()) {
      if (!node.id().equals(localNodeId)) {
        others.put(node.id(), allChannels.get(node.id()));
      }
    }

    return others;
  }

  @Override
  public ManagedOutboundChannel channelFor(final Node node) {
    return allChannels.get(node.id());
  }

  @Override
  public Map<Id, ManagedOutboundChannel> channelsFor(final Collection<Node> nodes) {
    final Map<Id, ManagedOutboundChannel> others = new HashMap<>();
    for (final Node node : nodes) {
      others.put(node.id(), allChannels.get(node.id()));
    }
    return others;
  }

  @Override
  public void close() {

  }

  @Override
  public void close(final Id id) {

  }
}

// Copyright © 2012-2022 VLINGO LABS. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.xoom.wire.channel;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

import io.vlingo.xoom.wire.message.RawMessageBuilder;

public class SocketChannelSelectionReader extends SelectionReader {
  public SocketChannelSelectionReader(final ChannelMessageDispatcher dispatcher, final SelectionKey key) {
    super(dispatcher, key);
  }

  @Override
  public void read() throws IOException {
    final SocketChannel channel = (SocketChannel) key.channel();
    final RawMessageBuilder builder = (RawMessageBuilder) key.attachment();

    int bytesRead = 0;
    do {
      bytesRead = channel.read(builder.workBuffer());
    } while (bytesRead > 0);

    dispatcher.dispatchMessagesFor(builder);
    
    if (bytesRead == -1) {
      closeClientResources(channel);
    }
  }
}

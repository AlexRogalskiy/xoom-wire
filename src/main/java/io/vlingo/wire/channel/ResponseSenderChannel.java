// Copyright © 2012-2020 VLINGO LABS. All rights reserved.
//
// This Source Code Form is subject to the terms of the
// Mozilla Public License, v. 2.0. If a copy of the MPL
// was not distributed with this file, You can obtain
// one at https://mozilla.org/MPL/2.0/.

package io.vlingo.wire.channel;

import io.vlingo.wire.message.ConsumerByteBuffer;

public interface ResponseSenderChannel {
  void abandon(final RequestResponseContext<?> context);
  void explicitClose(final RequestResponseContext<?> requestResponseContext, final boolean option);
  void respondWith(final RequestResponseContext<?> context, final ConsumerByteBuffer buffer);
  void respondWith(final RequestResponseContext<?> context, final ConsumerByteBuffer buffer, final boolean closeFollowing);
}

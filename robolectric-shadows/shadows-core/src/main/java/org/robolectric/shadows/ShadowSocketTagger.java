package org.robolectric.shadows;

import dalvik.system.SocketTagger;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

import java.net.Socket;
import java.net.SocketException;

/**
 * Shadow for {@link dalvik.system.SocketTagger}.
 */
@Implements(value = SocketTagger.class, isInAndroidSdk = false)
public class ShadowSocketTagger {

  @Implementation
  protected final void tag(Socket socket) throws SocketException {
  }

  @Implementation
  protected final void untag(Socket socket) throws SocketException {
  }
}

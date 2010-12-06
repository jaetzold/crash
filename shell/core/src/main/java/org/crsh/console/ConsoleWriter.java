/*
 * Copyright (C) 2010 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.crsh.console;

import java.io.IOException;

/**
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public abstract class ConsoleWriter {

  /**
   * Clears the buffer without doing any echoing.
   */
  public abstract void clearBuffer();

  public abstract boolean isEchoing();

  public abstract void setEchoing(boolean echoing);

  public abstract String set(String s) throws IOException;

  public abstract void appendData(String s) throws IOException;

  public abstract void appendData(char c) throws IOException;

  public abstract int appendDel() throws IOException;

  public abstract void moveRight() throws IOException;

  public abstract void moveLeft() throws IOException;
}
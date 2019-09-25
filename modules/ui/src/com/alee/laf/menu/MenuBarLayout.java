/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.laf.menu;

import com.alee.api.annotations.NotNull;
import com.alee.api.merge.Mergeable;
import com.alee.extended.layout.AbstractLineLayout;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.swing.*;
import java.awt.*;

/**
 * Custom {@link AbstractLineLayout} for {@link JMenuBar} component.
 *
 * @author Mikle Garin
 */
@XStreamAlias ( "MenuBarLayout" )
public class MenuBarLayout extends AbstractLineLayout implements Mergeable, Cloneable
{
    /**
     * Constructs new {@link MenuBarLayout}.
     */
    public MenuBarLayout ()
    {
        super ( 0, 20 );
    }

    @Override
    public int getOrientation ( @NotNull final Container container )
    {
        return HORIZONTAL;
    }

    /**
     * The UI resource version of {@link MenuBarLayout}.
     */
    @XStreamAlias ( "MenuBarLayout$UIResource" )
    public static final class UIResource extends MenuBarLayout implements javax.swing.plaf.UIResource
    {
        /**
         * Implementation is used completely from {@link MenuBarLayout}.
         */
    }
}
/**
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2012 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package com.qualitype.nexus.plugins.tycho;

import java.util.Map;

import com.qualitype.nexus.plugins.tycho.P2TychoRepositoryAggregatorConfiguration;


public class P2TychoRepositoryAggregatorConfiguration
{

    public static final String REPOSITORY = "repositoryId";

    private final String repositoryId;

    public P2TychoRepositoryAggregatorConfiguration( final Map<String, String> properties )
    {
        repositoryId = properties.get( REPOSITORY );
    }

    public String repositoryId()
    {
        return repositoryId;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( repositoryId == null ) ? 0 : repositoryId.hashCode() );
        return result;
    }

    @Override
    public boolean equals( final Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        if ( obj == null )
        {
            return false;
        }
        if ( getClass() != obj.getClass() )
        {
            return false;
        }
        final P2TychoRepositoryAggregatorConfiguration other = (P2TychoRepositoryAggregatorConfiguration) obj;
        if ( repositoryId == null )
        {
            if ( other.repositoryId != null )
            {
                return false;
            }
        }
        else if ( !repositoryId.equals( other.repositoryId ) )
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        final StringBuilder builder = new StringBuilder();
        builder.append( "P2RepositoryAggregatorConfiguration [" );
        if ( repositoryId != null )
        {
            builder.append( "repositoryId=" );
            builder.append( repositoryId );
        }
        builder.append( "]" );
        return builder.toString();
    }

}

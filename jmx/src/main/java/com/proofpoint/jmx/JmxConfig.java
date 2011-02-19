/*
 * Copyright 2010 Proofpoint, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.proofpoint.jmx;

import com.proofpoint.configuration.Config;

public final class JmxConfig
{
    private Integer rmiRegistryPort;
    private Integer rmiServerPort;
    private String hostname;

    public Integer getRmiRegistryPort()
    {
        return rmiRegistryPort;
    }

    @Config("jmx.rmiregistry.port")
    public JmxConfig setRmiRegistryPort(Integer rmiRegistryPort)
    {
        this.rmiRegistryPort = rmiRegistryPort;
        return this;
    }

    public Integer getRmiServerPort()
    {
        return rmiServerPort;
    }

    @Config("jmx.rmiserver.port")
    public JmxConfig setRmiServerPort(Integer rmiServerPort)
    {
        this.rmiServerPort = rmiServerPort;
        return this;
    }

    public String getHostname()
    {
        return hostname;
    }

    @Config("jmx.rmiserver.hostname")
    public JmxConfig setHostname(String hostname)
    {
        this.hostname = hostname;
        return this;
    }
}

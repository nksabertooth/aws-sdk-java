/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a load balancer in Elastic Load Balancing to use in a deployment. Instances are registered directly
 * with a load balancer, and traffic is routed to the load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ELBInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ELBInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For blue/green deployments, the name of the load balancer that will be used to route traffic from original
     * instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load
     * balancer that instances are deregistered from so they are not serving traffic during a deployment, and then
     * re-registered with after the deployment completes.
     * </p>
     */
    private String name;

    /**
     * <p>
     * For blue/green deployments, the name of the load balancer that will be used to route traffic from original
     * instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load
     * balancer that instances are deregistered from so they are not serving traffic during a deployment, and then
     * re-registered with after the deployment completes.
     * </p>
     * 
     * @param name
     *        For blue/green deployments, the name of the load balancer that will be used to route traffic from original
     *        instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the
     *        load balancer that instances are deregistered from so they are not serving traffic during a deployment,
     *        and then re-registered with after the deployment completes.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * For blue/green deployments, the name of the load balancer that will be used to route traffic from original
     * instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load
     * balancer that instances are deregistered from so they are not serving traffic during a deployment, and then
     * re-registered with after the deployment completes.
     * </p>
     * 
     * @return For blue/green deployments, the name of the load balancer that will be used to route traffic from
     *         original instances to replacement instances in a blue/green deployment. For in-place deployments, the
     *         name of the load balancer that instances are deregistered from so they are not serving traffic during a
     *         deployment, and then re-registered with after the deployment completes.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * For blue/green deployments, the name of the load balancer that will be used to route traffic from original
     * instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the load
     * balancer that instances are deregistered from so they are not serving traffic during a deployment, and then
     * re-registered with after the deployment completes.
     * </p>
     * 
     * @param name
     *        For blue/green deployments, the name of the load balancer that will be used to route traffic from original
     *        instances to replacement instances in a blue/green deployment. For in-place deployments, the name of the
     *        load balancer that instances are deregistered from so they are not serving traffic during a deployment,
     *        and then re-registered with after the deployment completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ELBInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ELBInfo == false)
            return false;
        ELBInfo other = (ELBInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ELBInfo clone() {
        try {
            return (ELBInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.ELBInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}

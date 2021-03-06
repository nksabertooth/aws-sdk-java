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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SubnetIpv6CidrBlockAssociation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubnetIpv6CidrBlockAssociationStaxUnmarshaller implements Unmarshaller<SubnetIpv6CidrBlockAssociation, StaxUnmarshallerContext> {

    public SubnetIpv6CidrBlockAssociation unmarshall(StaxUnmarshallerContext context) throws Exception {
        SubnetIpv6CidrBlockAssociation subnetIpv6CidrBlockAssociation = new SubnetIpv6CidrBlockAssociation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return subnetIpv6CidrBlockAssociation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("associationId", targetDepth)) {
                    subnetIpv6CidrBlockAssociation.setAssociationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6CidrBlock", targetDepth)) {
                    subnetIpv6CidrBlockAssociation.setIpv6CidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6CidrBlockState", targetDepth)) {
                    subnetIpv6CidrBlockAssociation.setIpv6CidrBlockState(SubnetCidrBlockStateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return subnetIpv6CidrBlockAssociation;
                }
            }
        }
    }

    private static SubnetIpv6CidrBlockAssociationStaxUnmarshaller instance;

    public static SubnetIpv6CidrBlockAssociationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubnetIpv6CidrBlockAssociationStaxUnmarshaller();
        return instance;
    }
}

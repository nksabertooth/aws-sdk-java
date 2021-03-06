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
 * SpotMarketOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpotMarketOptionsStaxUnmarshaller implements Unmarshaller<SpotMarketOptions, StaxUnmarshallerContext> {

    public SpotMarketOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        SpotMarketOptions spotMarketOptions = new SpotMarketOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return spotMarketOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MaxPrice", targetDepth)) {
                    spotMarketOptions.setMaxPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SpotInstanceType", targetDepth)) {
                    spotMarketOptions.setSpotInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BlockDurationMinutes", targetDepth)) {
                    spotMarketOptions.setBlockDurationMinutes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ValidUntil", targetDepth)) {
                    spotMarketOptions.setValidUntil(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceInterruptionBehavior", targetDepth)) {
                    spotMarketOptions.setInstanceInterruptionBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return spotMarketOptions;
                }
            }
        }
    }

    private static SpotMarketOptionsStaxUnmarshaller instance;

    public static SpotMarketOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SpotMarketOptionsStaxUnmarshaller();
        return instance;
    }
}

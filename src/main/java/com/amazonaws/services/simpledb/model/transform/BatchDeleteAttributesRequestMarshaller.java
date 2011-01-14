/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpledb.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Batch Delete Attributes Request Marshaller
 */
public class BatchDeleteAttributesRequestMarshaller implements Marshaller<Request<BatchDeleteAttributesRequest>, BatchDeleteAttributesRequest> {

    public Request<BatchDeleteAttributesRequest> marshall(BatchDeleteAttributesRequest batchDeleteAttributesRequest) {
        Request<BatchDeleteAttributesRequest> request = new DefaultRequest<BatchDeleteAttributesRequest>(batchDeleteAttributesRequest, "AmazonSimpleDB");
        request.addParameter("Action", "BatchDeleteAttributes");
        request.addParameter("Version", "2009-04-15");
        if (batchDeleteAttributesRequest != null) {
            if (batchDeleteAttributesRequest.getDomainName() != null) {
                request.addParameter("DomainName", StringUtils.fromString(batchDeleteAttributesRequest.getDomainName()));
            }
        }

        if (batchDeleteAttributesRequest != null) {
            java.util.List<DeletableItem> itemsList = batchDeleteAttributesRequest.getItems();
            int itemsListIndex = 1;
            for (DeletableItem itemsListValue : itemsList) {
                if (itemsListValue != null) {
                    if (itemsListValue.getName() != null) {
                        request.addParameter("Item." + itemsListIndex + ".ItemName", StringUtils.fromString(itemsListValue.getName()));
                    }
                }

                if (itemsListValue != null) {
                    java.util.List<Attribute> attributesList = itemsListValue.getAttributes();
                    int attributesListIndex = 1;
                    for (Attribute attributesListValue : attributesList) {
                        if (attributesListValue != null) {
                            if (attributesListValue.getName() != null) {
                                request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Name", StringUtils.fromString(attributesListValue.getName()));
                            }
                        }
                        if (attributesListValue != null) {
                            if (attributesListValue.getAlternateNameEncoding() != null) {
                                request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".AlternateNameEncoding", StringUtils.fromString(attributesListValue.getAlternateNameEncoding()));
                            }
                        }
                        if (attributesListValue != null) {
                            if (attributesListValue.getValue() != null) {
                                request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".Value", StringUtils.fromString(attributesListValue.getValue()));
                            }
                        }
                        if (attributesListValue != null) {
                            if (attributesListValue.getAlternateValueEncoding() != null) {
                                request.addParameter("Item." + itemsListIndex + ".Attribute." + attributesListIndex + ".AlternateValueEncoding", StringUtils.fromString(attributesListValue.getAlternateValueEncoding()));
                            }
                        }

                        attributesListIndex++;
                    }
                }

                itemsListIndex++;
            }
        }


        return request;
    }
}

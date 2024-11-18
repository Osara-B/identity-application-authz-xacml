/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.entitlement.endpoint.exception;

import org.wso2.carbon.identity.entitlement.endpoint.util.EntitlementEndpointConstants;

/**
 * Concrete exception class extending AnstractEntitlementExcetion
 * Corresponds to an error occurred in processing a response
 */
public class ResponseWriteException extends AbstractEntitlementException {
    public ResponseWriteException() {
        super(EntitlementEndpointConstants.ERROR_RESPONSE_READ_CODE,
                EntitlementEndpointConstants.ERROR_RESPONSE_READ_MESSAGE);
    }

    public ResponseWriteException(String description) {
        super(EntitlementEndpointConstants.ERROR_RESPONSE_READ_CODE, description);
    }

    public ResponseWriteException(int code, String description) {
        super(code, description);
    }

    public ResponseWriteException(String description, Exception exception) {
        super(description, exception);
    }
}

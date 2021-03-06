/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.registry.jcr;

import javax.jcr.Credentials;
import javax.jcr.SimpleCredentials;


public class RegistrySimpleCredentials implements Credentials {

    private SimpleCredentials registrySimpleCredentials;

    public RegistrySimpleCredentials(){
    }

    public RegistrySimpleCredentials(String userID, char[] password) {
        this.registrySimpleCredentials = new SimpleCredentials(userID, password);
    }

    public void setRegistrySimpleCredentials(SimpleCredentials registrySimpleCredentials) {
        this.registrySimpleCredentials = registrySimpleCredentials;
    }

    public Object getAttribute(String name) {
        return registrySimpleCredentials.getAttribute(name);
    }

    public String[] getAttributeNames() {
        return registrySimpleCredentials.getAttributeNames();
    }

    public char[] getPassword() {
        return registrySimpleCredentials.getPassword();
    }

    public String getUserID() {
        return registrySimpleCredentials.getUserID();
    }

    public void removeAttribute(String name) {
        registrySimpleCredentials.removeAttribute(name);
    }

    public void setAttribute(String name, Object value) {
        registrySimpleCredentials.setAttribute(name, value);
    }


}



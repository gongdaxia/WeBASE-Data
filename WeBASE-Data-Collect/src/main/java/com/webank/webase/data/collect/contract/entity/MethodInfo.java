/**
 * Copyright 2014-2020  the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.webank.webase.data.collect.contract.entity;

import lombok.Data;

/**
 * Entity class of table tb_method.
 */
@Data
public class MethodInfo {
    private String methodId;
    private String methodName;
    private String abiInfo;
    private String methodType;
    private String contractName;
    private String contractAbi;
    // general contract and precompiled contract
    private Integer contractType;
}
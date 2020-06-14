/**
 * Copyright 2014-2020 the original author or authors.
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
package com.webank.webase.data.collect.table;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TableMapper {
    
    int createTbChain();

    int createTbFront();

    int createTbGroup();

    int createTbFrontGroupMap();
    
    int createTbUser();
    
    int createTbContract();
    
    int createTbMethod();
    
    int createTbSolc();

    int createTbTaskPool(@Param("tableName") String tableName);

    int createTbBlock(@Param("tableName") String tableName);

    int createTbTransaction(@Param("tableName") String tableName);

    int createTbReceipt(@Param("tableName") String tableName);

    int createTbParser(@Param("tableName") String tableName);

    List<String> queryTables(@Param("dbName") String dbName, @Param("tableName") String tableName);

    int dropTable(@Param("dbName") String dbName, @Param("tableName") String tableName);

    int deleteByTableName(@Param("tableName") String tableName);
}

/*
 *    Copyright 2015-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package demo.batis.dao;

import demo.batis.domain.City;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * @author Eddú Meléndez
 */

@AllArgsConstructor
@Component
public class CityDao {

    private final SqlSession sqlSession;

//    public CityDao(SqlSession sqlSession) {
//        this.sqlSession = sqlSession;
//    }

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }

}

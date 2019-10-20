/*
 * Copyright (C) 2019 唐家林
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

package net.sudot.spockexamples.dao;

import net.sudot.spockexamples.model.Student;

/**
 * 学生
 *
 * @author tangjialin on 2019/10/20.
 */
public interface StudentDao {

    /**
     * 通过学号查找学生信息
     *
     * @param sn 学号
     * @return 返回学生信息
     */
    Student findById(String sn);
}

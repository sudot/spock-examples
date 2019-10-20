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

package net.sudot.spockexamples.service;

import net.sudot.spockexamples.dao.StudentDao;
import net.sudot.spockexamples.model.Student;
import org.junit.Assert;
import org.junit.Test;

public class StudentServiceJUnitTest {

    @Test
    public void checkQualified() {
        Float[] scores = {
                null,
                50F,
                59F,
                60F,
                70F,
        };
        boolean[] expectQualifies = {
                false,
                false,
                false,
                true,
                true
        };
        for (int i = 0; i < scores.length; i++) {
            Float score = scores[i];
            StudentDao studentDao = id -> new Student().setScore(score);
            StudentService studentService = new StudentService(studentDao);
            boolean qualified = studentService.checkQualified("007");
            Assert.assertEquals(expectQualifies[i], qualified);
        }
    }
}
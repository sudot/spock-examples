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

package net.sudot.spockexamples.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 学生
 *
 * @author tangjialin on 2019/10/20.
 */
@Getter
@Setter
@Accessors(chain = true)
public class Student {
    /** 学号 */
    private String sn;
    /** 姓名 */
    private String name;
    /** 分数 */
    private Float score;
}

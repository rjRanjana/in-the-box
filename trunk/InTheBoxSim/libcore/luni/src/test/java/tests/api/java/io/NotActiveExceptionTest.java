/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package tests.api.java.io;

import java.io.NotActiveException;

import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetClass;
import dalvik.annotation.TestTargetNew;

@TestTargetClass(NotActiveException.class)
public class NotActiveExceptionTest extends junit.framework.TestCase {

    /**
     * @tests java.io.NotActiveException#NotActiveException()
     */
    @TestTargetNew(
            level = TestLevel.COMPLETE,
            method = "NotActiveException",
            args = {}
        )
    public void test_Constructor() {
        try {
            if (true) // To avoid unreachable code compilation error.
                throw new NotActiveException();
            fail("Test 1: NotActiveException expected.");
        } catch (NotActiveException e) {
            assertNull("Test 2: Null expected for exceptions constructed without a message.",
                    e.getMessage());
        }
    }

    /**
     * @tests java.io.NotActiveException#NotActiveException(java.lang.String)
     */
    @TestTargetNew(
            level = TestLevel.COMPLETE,
            method = "NotActiveException",
            args = {java.lang.String.class}
        )
    public void test_ConstructorLjava_lang_String() {
        try {
            if (true) // To avoid unreachable code compilation error.
                throw new NotActiveException("Something went wrong.");
            fail("Test 1: NotActiveException expected.");
        } catch (NotActiveException e) {
            assertEquals("Test 2: Incorrect message;",
                    "Something went wrong.", e.getMessage());
        }
    }

}
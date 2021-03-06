/*
 * Copyright (C) 2015 Mr.Simple <bboyfeiyu@gmail.com>
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

package org.simple.eventbus.test;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author mrsimple
 */
public class BusTestSuite extends TestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(BusTestSuite.class)
                .includePackages(
                        "org.simple.eventbus.test.EventBusTest",
                        "org.simple.eventbus.test.EventTypeTest",
                        "org.simple.eventbus.test.ThreadModeTest",
                        "org.simple.eventbus.testDefaultMatchPolicyTest")
                .build();
    }
}

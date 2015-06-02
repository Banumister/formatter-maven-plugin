/**
 * Copyright 2010-2014. All work is copyrighted to their respective
 * author(s), unless otherwise stated.
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
package com.marvinformatics.formatter.java;

import com.marvinformatics.formatter.AbstractFormatterTest;

/**
 * @author marvin.froeder
 */
public class JavaFormatterTest extends AbstractFormatterTest {

	public void testDoFormatFile() throws Exception {
		doTestFormat(new JavaFormatter(), "AnyClass.java",
				"c178cea8d43d16a4741dffc9be4e1b0a2931e897");
	}

}

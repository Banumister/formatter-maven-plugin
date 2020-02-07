/*
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
package net.revelc.code.formatter.java;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;

import org.junit.jupiter.api.Test;

import net.revelc.code.formatter.AbstractFormatterTest;
import net.revelc.code.formatter.LineEnding;

/**
 * @author marvin.froeder
 */
public class JavaFormatterTest extends AbstractFormatterTest {

    @Test
    public void testDoFormatFile() throws Exception {
        doTestFormat(new JavaFormatter(), "AnyClass.java",
                "fe7bdeec160a33a744209602d1ae99f94bd8ff433dd3ab856bcf6857588170d5c69b027f15c72bd7a6c0ae6e3659a9ab62196fa198366ec0c0722286257cbdca");
    }

    @Test
    public void testDoFormatFileKeepLineFeedLF() throws Exception {
        doTestFormat(Collections.emptyMap(), new JavaFormatter(), "AnyClassLF.java",
                "5d41510e74b87c6b38c8e4692d53aa9de3d7a85d08c72697b77c48541534147a028e799289d49c05cc9a3cc601e64c86bb954bb62b03b7277616b71ecc5bd716",
                LineEnding.KEEP);
    }

    @Test
    public void testDoFormatFileKeepLineFeedCR() throws Exception {
        doTestFormat(Collections.emptyMap(), new JavaFormatter(), "AnyClassCR.java",
                "cf44c525667d8c49c80d390215e4d1995c10e8966583da0920e3917837188e5b95159f9dc7b4ae2559fbfa4550cbbaca166edc8991907d5fd4bbc74a1402e97e",
                LineEnding.KEEP);
    }

    @Test
    public void testDoFormatFileKeepLineFeedCRLF() throws Exception {
        doTestFormat(Collections.emptyMap(), new JavaFormatter(), "AnyClassCRLF.java",
                "fe7bdeec160a33a744209602d1ae99f94bd8ff433dd3ab856bcf6857588170d5c69b027f15c72bd7a6c0ae6e3659a9ab62196fa198366ec0c0722286257cbdca",
                LineEnding.KEEP);
    }

    @Test
    public void testIsIntialized() throws Exception {
        JavaFormatter javaFormatter = new JavaFormatter();
        assertFalse(javaFormatter.isInitialized());
        javaFormatter.init(Collections.emptyMap(), new AbstractFormatterTest.TestConfigurationSource(TEST_OUTPUT_DIR));
        assertTrue(javaFormatter.isInitialized());
    }

}

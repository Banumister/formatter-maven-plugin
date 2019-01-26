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
package net.revelc.code.formatter.css;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;

import org.junit.jupiter.api.Test;

import net.revelc.code.formatter.AbstractFormatterTest;

/**
 * @author yoshiman
 */
public class CssFormatterTest extends AbstractFormatterTest {

    @Test
    public void testDoFormatFile() throws Exception {
        // FIXME Handle linux vs windows since this formatter does not accept line endings
        if (System.lineSeparator().equals("\n")) {
            doTestFormat(new CssFormatter(), "someFile.css",
                    "590c14fa99d8296d7e1c6d4124de96e8fc436ee3f44704445a966befd37488e336b14e60fdb7d26181f6fc0c05848c1cc32701b34f98846f3122d4d057de9605");
        } else {
            doTestFormat(new CssFormatter(), "someFile.css",
                    "c3bdea2e2755c1e773459024ca5114282da1ebf0c46d975d90d2567f39ac16c7c6f227745a80f4912d55049a177699ffe619df444ebb3cffeb8574e41babaf0b");
        }
    }

    @Test
    public void testIsIntialized() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();
        assertFalse(cssFormatter.isInitialized());
        cssFormatter.init(Collections.emptyMap(), new AbstractFormatterTest.TestConfigurationSource(TEST_OUTPUT_DIR));

        assertTrue(cssFormatter.isInitialized());
    }

}

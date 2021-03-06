/*
 * Copyright 2016 the original author or authors.
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

package beyondlambdas.slides.s1;

import org.junit.Test;

import java.util.Optional;

import static beyondlambdas.slides.s1.Advise.currentAdvise;

@SuppressWarnings("ConstantConditions")
public class _1b {

    final Oracle oracle = new Oracle();

    String _() {
        final Advise advise = currentAdvise();

        return Optional.ofNullable(advise)
                       .map(Advise::cheap)
                       .orElse(oracle.advise().expensive());
    }

    @Test
    public void should_get_advice() {
        _();
    }
}
